package com.template.mock.controller;

import com.template.mock.model.*;
import com.template.mock.service.MockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Arrays;
import javax.servlet.http.HttpSession;

/**
 * Classe per implementare i mock da restituire ad Adobe per testare i servizi DDL
 *
 * UTENZE RICHIESTE:
 *
 * Cod.Conto: 801107426001 ->
 *  utente attivo GAS
 * Cod.Conto: 801107427001 ->
 *  utente attivo LUCE
 * Cod.Conto: 801107428001 ->
 *  utente attivo DUAL
 * Cod.Conto: 801107429001 ->
 *  utente IN ATTIVAZIONE
 * Cod.Conto: 801107430001 ->
 *  utente DISABILITATA
 */
@CrossOrigin
@RestController
@RequestMapping("mockbff/api/")
public class MockController 
{

    @Autowired
    MockService mockService;

    /**
     * Mock Init
     */
    @RequestMapping("/init")
    @GetMapping
    public ResponseEntity<InitModel> mockInit(HttpServletRequest request, @RequestParam String sessionId, @RequestParam String initApplication)
    {
        //Inizializzo il response
        ResponseEntity<InitModel> result = null;

        //Richiamo l'init dal service
        InitModel initModel = mockService.getMockInit();

        //Assegno e ritorno il response
        result = new ResponseEntity<InitModel>(initModel, HttpStatus.OK);

        return result;
    }

    /**
     * Mock setSessionModel
     */
    @RequestMapping("/setSessionModel")
    @GetMapping
    public ResponseEntity<Boolean> mockSessionTest(HttpServletRequest request){
        //Inizializzo il response
        ResponseEntity<Boolean> result = null;

        // Ricavo la sessione
        HttpSession session = request.getSession();

        //Richiamo l'init dal service
        InitModel initModel = mockService.getMockInit();

        session.setAttribute("initModel", initModel);

        //Assegno e ritorno il response
        result = new ResponseEntity<Boolean>(true, HttpStatus.OK);

        return result;
    }

    /**
     * Mock getSessionModel
     */
    @RequestMapping("/getSessionModel")
    @GetMapping
    public ResponseEntity<InitModel> getSessionModel(HttpServletRequest request){
        //Inizializzo il response
        ResponseEntity<InitModel> result = null;

        // Ricavo la sessione
        HttpSession session = request.getSession();

        InitModel initModel = (InitModel) session.getAttribute("initModel");

        //Assegno e ritorno il response
        result = new ResponseEntity<InitModel>(initModel, HttpStatus.OK);

        return result;
    }

    /**
     * Mock conti
     */
    @RequestMapping("/conti/{codiceConto}")
    @GetMapping
    public ResponseEntity<ListaContiClienteModel> mockConti(@PathVariable("codiceConto") String codiceConto, HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Inizializzo il response
        ResponseEntity<ListaContiClienteModel> result = null;
        
        try {
            //Richiamo il servizio mock dei conti
            ListaContiClienteModel listaContiClienteModel = mockService.getMockConti(Long.parseLong(codiceConto));
            //Assegno e ritorno il response
            result = new ResponseEntity<>(listaContiClienteModel, HttpStatus.OK);
        } catch (Exception e){
            response.sendError(400, "CODICE CONTO DEVE ESSERE UN NUMERO");
        }

        return result;
    }

    /**
     * Mock bollette
     */
    @RequestMapping("/conti/{codiceConto}/bollette")
    @GetMapping
    public ResponseEntity<BolletteModel> mockBollette(@PathVariable("codiceConto") String codiceConto, HttpServletRequest request)
    {
        //Inizializzo il response
        ResponseEntity<BolletteModel> result = null;

        //Richiamo il mock delle bollette
        BolletteModel bolletteModel = mockService.getMockBollette(codiceConto);

        //Assegno e ritorno il response
        result = new ResponseEntity<BolletteModel>(bolletteModel, HttpStatus.OK);

        return result;
    }

    /**
     * Mock estratto-conto / STATO PAGAMENTI
     */
    @RequestMapping("/conti/{codiceContoCliente}/estratto-conto/bollette")
    @GetMapping
    public ResponseEntity<EstrattoContoModel> mockEstrattoConto(@PathVariable("codiceContoCliente") String codiceContoCliente, HttpServletRequest request)
    {
        //Inizializzo il response
        ResponseEntity<EstrattoContoModel> result = null;

        String[] availableCodiceConto = {
            "505375664792",
            "505375561741",
            "505476161227"
        };
        
        boolean test1 = Arrays.asList(availableCodiceConto).contains(codiceContoCliente);
        
        if (test1 == true){
            //Richiamo il mock delle bollette
            EstrattoContoModel estrattoContoModel = mockService.getMockEstrattoConto(codiceContoCliente);
            //Assegno e ritorno il response
            result = new ResponseEntity<>(estrattoContoModel, HttpStatus.OK);
        } else {
            EstrattoContoModel estrattoContoModel = null;
            result = new ResponseEntity<>(estrattoContoModel, HttpStatus.BAD_REQUEST);
        }
        
        return result;
    }

    /**
     * Mock lista-forniture
     */
    @RequestMapping("/conti/{codiceConto}/lista-forniture")
    @GetMapping
    public ResponseEntity<AnagraficaFornitureModel> mockListaForniture(@PathVariable("codiceConto") String codiceConto, HttpServletRequest request){
        //Inizializzo il response
        ResponseEntity<AnagraficaFornitureModel> result = null;

        String[] availableCodiceConto = {
            "505375664792",
            "505375561741",
            "505476161227"
        };

        boolean test1 = Arrays.asList(availableCodiceConto).contains(codiceConto);
        
        if (test1 == true){
            //Richiamo il mock delle forniture
            AnagraficaFornitureModel anagraficaFornitureModel = mockService.getAnagraficaForniture(codiceConto);
            //Assegno e ritorno il response
            result = new ResponseEntity<>(anagraficaFornitureModel, HttpStatus.OK);
        } else
            result = new ResponseEntity<>(null, HttpStatus.BAD_REQUEST); 
        
        return result;
    }

}
