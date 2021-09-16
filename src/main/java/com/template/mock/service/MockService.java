package com.template.mock.service;

import com.template.mock.enumeration.StatoBollettaView;
import com.template.mock.model.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Service per la gestione dei Mock
 */

@Service
public class MockService 
{
    /**
     * Mock per il servizio di init
     * @return InitMotel
     */
    public InitModel getMockInit()
    {
        InitModel initModel = new InitModel();
        initModel.setCodiceCliente("801107426");
        initModel.setCodiceClienteImpersonificato("801107426");
		initModel.setCodiceContoDefault("801107426001");
		initModel.setGenericErrorMessage(null);
		initModel.setStatoUtente("ATTIVO");
		initModel.setTipoUtente("RETAIL");		
		initModel.setAdmin(true);
		initModel.setAdminPrezzi(false);
		initModel.setAdminCheckup(false);
		initModel.setServerName("wlsdommiw-06");
		initModel.setNome("TARABELLA");
		initModel.setCognome("LALL");
		initModel.setNumeroNotifiche(0);
		initModel.setFlAmmCondominio(false);

        return initModel;
    }

    /**
     * Mock per il servizio conti
     * @return ListaContiClientiModel
     */
    public ListaContiClienteModel getMockConti(Long codConto)
    {
        /* Creazione della lista di forniture
           Attualmente la lista delle forniture è vuota. 
           Si possono inserire delle forniture aggiungendo oggetti FornituraModel alla lista
        */
        List<FornituraModel> fornitureModel = new ArrayList<FornituraModel>();

        List<ContoModel> listaConti = new LinkedList<ContoModel>();
        ListaContiClienteModel listaContiClienteModel = new ListaContiClienteModel();

        //UTENTE ATTIVO GAS
        if (codConto.equals(801107426001L)){
            //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ALLA CHIESA 1 ALBIOLO 22070 CO");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505499493805");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("ATTIVO");
            contoModel1.setCommodity("GAS");
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);

            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity("GAS");
        }
        //UTENTE ATTIVO LUCE
        else if(codConto.equals(801107427001L)){
            //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ALLA CHIESA 1 ALBIOLO 22070 CO");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505499493805");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("ATTIVO");
            contoModel1.setCommodity("LUCE");
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);

            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity("LUCE");
        }
        //UTENTE ATTIVO DUAL
        else if(codConto.equals(801107428001L)){
            //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ALLA CHIESA 1 ALBIOLO 22070 CO");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505499493805");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("ATTIVO");
            contoModel1.setCommodity("DUAL"); //Incerto se Dual vada nel conto specifico o riepilogo lista conti
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);

            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity("DUAL"); //Dual(?)
        }
        //UTENTE IN ATTIVAZIONE
        else if(codConto.equals(801107429001L)){
            //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ALLA CHIESA 9 ALBIOLO 22070 CO");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505499493805");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("IN ATTIVAZIONE");
            contoModel1.setCommodity("GAS");
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);

            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity("GAS");
        }
        //UTENTE DISABILITATA
        else if(codConto.equals(801107430001L)){
            //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ALLA CHIESA 11 ALBIOLO 22070 CO");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505499493805");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("DISABILITATA");
            contoModel1.setCommodity("LUCE");
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);

            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity("LUCE");
        }
        else if(codConto.equals(824853592L)){
           //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ETTORE ARRIGONI DEGLI ODDI 12 ROMA 00169 RM");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505375664792");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("ATTIVO");
            contoModel1.setCommodity("GAS");
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);
            
            ContoModel contoModel2 = new ContoModel();
            contoModel2.setAlias("VIA ARRIGONI DEGLI ODDI ETTORE 12 ROMA 00169 RM");
            contoModel2.setAliasIsBlank(true);
            contoModel2.setCodice("505375561741");
            contoModel2.setSelezionato("false");
            contoModel2.setTipo("ATTIVO");
            contoModel2.setCommodity("POWER");
            contoModel2.setForniture(fornitureModel);
            listaConti.add(contoModel2);
            
            ContoModel contoModel3 = new ContoModel();
            contoModel3.setAlias("VIA CAIO LELIO 40 ROMA 00175 RM");
            contoModel3.setAliasIsBlank(true);
            contoModel3.setCodice("505476161227");
            contoModel3.setSelezionato("false");
            contoModel3.setTipo("ATTIVO");
            contoModel3.setCommodity("DUAL");
            contoModel3.setForniture(fornitureModel);
            listaConti.add(contoModel3);
            
            ContoModel contoModel4 = new ContoModel();
            contoModel4.setAlias("VIA DELLA PELLICCIA 11 ROMA 00153 RM");
            contoModel4.setAliasIsBlank(true);
            contoModel4.setCodice("110865192602");
            contoModel4.setSelezionato("false");
            contoModel4.setTipo("CESSATO");
            contoModel4.setCommodity("GAS");
            contoModel4.setForniture(fornitureModel);
            listaConti.add(contoModel4);
            
            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity(null);
        }
        //UTENTE CON PIU' CONTI
        else {
            //Rendere dinamica la creazione di lista forniture tramite codice conto cliente
            fornitureModel = getListaForniture(codConto);

            //Creazione della lista di conti
            ContoModel contoModel1 = new ContoModel();
            contoModel1.setAlias("VIA ALLA CHIESA 1 ALBIOLO 22070 CO");
            contoModel1.setAliasIsBlank(true);
            contoModel1.setCodice("505499493805");
            contoModel1.setSelezionato("true");
            contoModel1.setTipo("ATTIVO");
            contoModel1.setCommodity("GAS");
            contoModel1.setForniture(fornitureModel);
            listaConti.add(contoModel1);

            ContoModel contoModel2 = new ContoModel();
            contoModel2.setAlias("VIA ALLA CHIESA 2 ALBIOLO 22070 CO");
            contoModel2.setAliasIsBlank(true);
            contoModel2.setCodice("505502090176");
            contoModel2.setSelezionato("false");
            contoModel2.setTipo("ATTIVO");
            contoModel2.setCommodity("LUCE");
            contoModel2.setForniture(fornitureModel);
            listaConti.add(contoModel2);
            
            ContoModel contoModel3 = new ContoModel();
            contoModel3.setAlias("Piazza Vittorio Veneto 12 10125 TO");
            contoModel3.setAliasIsBlank(true);
            contoModel3.setCodice("505502090177");
            contoModel3.setSelezionato("false");
            contoModel3.setTipo("ATTIVO");
            contoModel3.setCommodity("GAS");
            contoModel3.setForniture(fornitureModel);
            listaConti.add(contoModel3);
            
            ContoModel contoModel4 = new ContoModel();
            contoModel4.setAlias("Via Aosta 17 10152 TO");
            contoModel4.setAliasIsBlank(true);
            contoModel4.setCodice("505502090178");
            contoModel4.setSelezionato("false");
            contoModel4.setTipo("ATTIVO");
            contoModel4.setCommodity("DUAL");
            contoModel4.setForniture(fornitureModel);
            listaConti.add(contoModel4);

            //Creazione della lista dei conti
            listaContiClienteModel.setConto(listaConti);
            listaContiClienteModel.setTipoCliente("RETAIL");
            listaContiClienteModel.setCommodity("DUAL");
        }

        return listaContiClienteModel;
    }

    /**
     * Mock per il servizio bollette
     * @return
     */
    public BolletteModel getMockBollette(String codiceConto)
    {

        BolletteModel bolletteObject            = new BolletteModel();
        ProssimaBollettaModel prossimaBolletta  = new ProssimaBollettaModel();
        List<BollettaModel> listaBollette       = new LinkedList<BollettaModel>();
        BollettaModel bolletta1                 = new BollettaModel();
        BollettaModel bolletta2                 = new BollettaModel();
        BollettaModel bolletta3                 = new BollettaModel();

        switch (codiceConto){
            case "505375561741":
                // Prossima bolletta
                prossimaBolletta.setEmissionePrevista(null);
                prossimaBolletta.setMsgEmissioneAlternativa(false);
                prossimaBolletta.setPubblicazionePrevista(null);

                bolletta1.setBillingSystemName("NETA");
                bolletta1.setBollettaSmart(null);
                bolletta1.setCodiceAzienda(" 800");
                bolletta1.setCodiceBollettino("0027");
                bolletta1.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
                bolletta1.setEmissione("21/02/2020");
                bolletta1.setFatturaRateizzata("N");
                bolletta1.setFlDefaultDataElaborazioneLettera(false);
                bolletta1.setIdFattura("529398433");
                bolletta1.setIdProtocolloDocPdf("580120373");
                bolletta1.setImporto((float) 100.62);
                bolletta1.setImportoPagare("100.62");
                bolletta1.setImportoSIA("10062");
                bolletta1.setImportoVersato((float) 0.0);
                bolletta1.setLinkPagaOnline("http://pp.enigaseluce.com/ENIGASELUCE_it_IT/private/myeni-casa/ssb/private-dispatch.page?fwdName=redirectToSsb");
                bolletta1.setMac("95e73331eca074ca6e5105e55ada279a0f7028d9");
                bolletta1.setNonPagabileSIA(false);
                bolletta1.setNumeroBolletta("2010736162");
                bolletta1.setNumeroOrdine("505439940659002774");
                bolletta1.setNumPagina("1");
                bolletta1.setOptions(null);
                bolletta1.setPubblicazione("29/02/2020");
                bolletta1.setRate(null);
                bolletta1.setRatePresenti(false);
                bolletta1.setScadenza("13/03/2020");
                bolletta1.setStatoBollettaView(StatoBollettaView.VISIBILE);
                bolletta1.setStatoPagamento("PAGA ON LINE");
                bolletta1.setUrlBack("http://pp.enigaseluce.com/ENIGASELUCE_it_IT/private/myeni-casa/ssb/private-dispatch.page?fwdName=ssbResponseForBrowserFailure");
                bolletta1.setUrlDone("http://pp.enigaseluce.com/ENIGASELUCE_it_IT/private/myeni-casa/ssb/private-dispatch.page?fwdName=ssbResponseForBrowserSuccess&numero_bolletta=2010736162");
                bolletta1.setUrlMs("http://pp.enigaseluce.com/ENIGASELUCE_it_IT/ssb/public-dispatch.page?fwdName=ssbResponseForServer&numero_bolletta=2010736162&codiceContoCliente=505439940659&numeroBollettino=0027&billingSystemName=NETA&codiceAzienda=800&EMAILESERC=AM_Portale_Clienti_DOMM@eni.com");
                bolletta1.setRedirectPage(null);
                listaBollette.add(bolletta1);

                bolletta2.setBillingSystemName(null);
                bolletta2.setBollettaSmart(null);
                bolletta2.setCodiceAzienda(null);
                bolletta2.setCodiceBollettino("0025");
                bolletta2.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
                bolletta2.setEmissione("20/12/2019");
                bolletta2.setFatturaRateizzata("N");
                bolletta2.setFlDefaultDataElaborazioneLettera(false);
                bolletta2.setIdFattura("520464346");
                bolletta2.setIdProtocolloDocPdf("571257563");
                bolletta2.setImporto((float) 133.5);
                bolletta2.setImportoPagare("0.0");
                bolletta2.setImportoSIA(null);
                bolletta2.setImportoVersato((float) 133.5);
                bolletta2.setLinkPagaOnline("");
                bolletta2.setMac(null);
                bolletta2.setNonPagabileSIA(false);
                bolletta2.setNumeroBolletta("1943386563");
                bolletta2.setNumeroOrdine(null);
                bolletta2.setNumPagina("1");
                bolletta2.setOptions(null);
                bolletta2.setPubblicazione("28/12/2019");
                bolletta2.setRate(null);
                bolletta2.setRatePresenti(false);
                bolletta2.setScadenza("23/01/2020");
                bolletta2.setStatoBollettaView(StatoBollettaView.VISIBILE);
                bolletta2.setStatoPagamento("PAGATA");
                bolletta2.setUrlBack(null);
                bolletta2.setUrlDone(null);
                bolletta2.setUrlMs(null);
                bolletta2.setRedirectPage(null);
                listaBollette.add(bolletta2);

                bolletta3.setBillingSystemName(null);
                bolletta3.setBollettaSmart(null);
                bolletta3.setCodiceAzienda(null);
                bolletta3.setCodiceBollettino("0022");
                bolletta3.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
                bolletta3.setEmissione("04/10/2019");
                bolletta3.setFatturaRateizzata("N");
                bolletta3.setFlDefaultDataElaborazioneLettera(false);
                bolletta3.setIdFattura("504445640");
                bolletta3.setIdProtocolloDocPdf("554613355");
                bolletta3.setImporto((float) 99.73);
                bolletta3.setImportoPagare("0.0");
                bolletta3.setImportoSIA(null);
                bolletta3.setImportoVersato((float) 99.73);
                bolletta3.setLinkPagaOnline("");
                bolletta3.setMac(null);
                bolletta3.setNonPagabileSIA(false);
                bolletta3.setNumeroBolletta("1933725704");
                bolletta3.setNumeroOrdine(null);
                bolletta3.setNumPagina("1");
                bolletta3.setOptions(null);
                bolletta3.setPubblicazione("12/10/2019");
                bolletta3.setRate(null);
                bolletta3.setRatePresenti(false);
                bolletta3.setScadenza("25/10/2019");
                bolletta3.setStatoBollettaView(StatoBollettaView.VISIBILE);
                bolletta3.setStatoPagamento("PAGATA");
                bolletta3.setUrlBack(null);
                bolletta3.setUrlDone(null);
                bolletta3.setUrlMs(null);
                bolletta3.setRedirectPage(null);
                listaBollette.add(bolletta3);

                bolletteObject.setBollette(listaBollette);
                bolletteObject.setCommodity("DUAL");
                bolletteObject.setDataAutoletturaA(null);
                bolletteObject.setDataAutoletturaDa(null);
                bolletteObject.setDomiciliazione(false);
                bolletteObject.setEmail("smtest1412@eni.com");
                bolletteObject.setErrorDownloadMetadata(null);
                bolletteObject.setGenericErrorMessage(null);
                bolletteObject.setIndirizzoFornitura("VIA ROMA, 85 - EMPOLI (FI)");
                bolletteObject.setNumBolletteNonPagate(1);
                bolletteObject.setNumeroCliente("851356162");
                bolletteObject.setProssimaBolletta(prossimaBolletta);
                bolletteObject.setStatoConto("CESSATO");
                bolletteObject.setStatoUtente("CESSATO");
                bolletteObject.setTipoErrore(null);
                bolletteObject.setWidgetVisibile(true);
                break;
                
            case "505476161227":
                // Prossima bolletta
                prossimaBolletta.setEmissionePrevista("17/09/2021");
                prossimaBolletta.setMsgEmissioneAlternativa(false);
                prossimaBolletta.setPubblicazionePrevista("25/09/2021");

                bolletta1.setBillingSystemName(null);
                bolletta1.setBollettaSmart("https://interattiva.enigaseluce.com/372e184bfb974e129c890204df72f84e?utm_source=DIGITALI&utm_medium=portale&utm_campaign=NOBOLL");
                bolletta1.setCodiceAzienda(" 800");
                bolletta1.setCodiceBollettino("0061");
                bolletta1.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
                bolletta1.setEmissione("20/07/2021");
                bolletta1.setFatturaRateizzata("N");
                bolletta1.setFlDefaultDataElaborazioneLettera(false);
                bolletta1.setIdFattura("624379344");
                bolletta1.setIdProtocolloDocPdf("669505800");
                bolletta1.setImporto((float) 96.43);
                bolletta1.setImportoPagare("0.0");
                bolletta1.setImportoSIA(null);
                bolletta1.setImportoVersato((float) 96.43);
                bolletta1.setLinkPagaOnline("");
                bolletta1.setMac(null);
                bolletta1.setNonPagabileSIA(false);
                bolletta1.setNumeroBolletta("2125398035");
                bolletta1.setNumeroOrdine(null);
                bolletta1.setNumPagina("1");
                bolletta1.setOptions(null);
                bolletta1.setPubblicazione("28/07/2021");
                bolletta1.setRate(null);
                bolletta1.setRatePresenti(false);
                bolletta1.setScadenza("23/08/2021");
                bolletta1.setStatoBollettaView(StatoBollettaView.VISIBILE);
                bolletta1.setStatoPagamento("PAGATA");
                bolletta1.setUrlBack(null);
                bolletta1.setUrlDone(null);
                bolletta1.setUrlMs(null);
                bolletta1.setRedirectPage(null);
                listaBollette.add(bolletta1);

                bolletta2.setBillingSystemName(null);
                bolletta2.setBollettaSmart("https://interattiva.enigaseluce.com/07ad8939081344739282a2d7e61dc36e?utm_source=DIGITALI&utm_medium=portale&utm_campaign=NOBOLL");
                bolletta2.setCodiceAzienda(null);
                bolletta2.setCodiceBollettino("0059");
                bolletta2.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
                bolletta2.setEmissione("21/05/2021");
                bolletta2.setFatturaRateizzata("N");
                bolletta2.setFlDefaultDataElaborazioneLettera(false);
                bolletta2.setIdFattura("612552282");
                bolletta2.setIdProtocolloDocPdf("658896453");
                bolletta2.setImporto((float) 98.22);
                bolletta2.setImportoPagare("0.0");
                bolletta2.setImportoSIA(null);
                bolletta2.setImportoVersato((float) 98.22);
                bolletta2.setLinkPagaOnline("");
                bolletta2.setMac(null);
                bolletta2.setNonPagabileSIA(false);
                bolletta2.setNumeroBolletta("2119187848");
                bolletta2.setNumeroOrdine(null);
                bolletta2.setNumPagina("1");
                bolletta2.setOptions(null);
                bolletta2.setPubblicazione("29/05/2021");
                bolletta2.setRate(null);
                bolletta2.setRatePresenti(false);
                bolletta2.setScadenza("15/06/2021");
                bolletta2.setStatoBollettaView(StatoBollettaView.VISIBILE);
                bolletta2.setStatoPagamento("PAGATA");
                bolletta2.setUrlBack(null);
                bolletta2.setUrlDone(null);
                bolletta2.setUrlMs(null);
                bolletta2.setRedirectPage(null);
                listaBollette.add(bolletta2);

                bolletta3.setBillingSystemName(null);
                bolletta3.setBollettaSmart("https://interattiva.enigaseluce.com/5510e7860e534e5d928bcf8a9df2f361?utm_source=DIGITALI&utm_medium=portale&utm_campaign=NOBOLL");
                bolletta3.setCodiceAzienda(null);
                bolletta3.setCodiceBollettino("0053");
                bolletta3.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
                bolletta3.setEmissione("19/03/2021");
                bolletta3.setFatturaRateizzata("N");
                bolletta3.setFlDefaultDataElaborazioneLettera(false);
                bolletta3.setIdFattura("601272927");
                bolletta3.setIdProtocolloDocPdf("648145626");
                bolletta3.setImporto((float) 99.83);
                bolletta3.setImportoPagare("0.0");
                bolletta3.setImportoSIA(null);
                bolletta3.setImportoVersato((float) 99.83);
                bolletta3.setLinkPagaOnline("");
                bolletta3.setMac(null);
                bolletta3.setNonPagabileSIA(false);
                bolletta3.setNumeroBolletta("2113256636");
                bolletta3.setNumeroOrdine(null);
                bolletta3.setNumPagina("1");
                bolletta3.setOptions(null);
                bolletta3.setPubblicazione("27/03/2021");
                bolletta3.setRate(null);
                bolletta3.setRatePresenti(false);
                bolletta3.setScadenza("09/04/2021");
                bolletta3.setStatoBollettaView(StatoBollettaView.VISIBILE);
                bolletta3.setStatoPagamento("PAGATA");
                bolletta3.setUrlBack(null);
                bolletta3.setUrlDone(null);
                bolletta3.setUrlMs(null);
                bolletta3.setRedirectPage(null);
                listaBollette.add(bolletta3);

                bolletteObject.setBollette(listaBollette);
                bolletteObject.setCommodity("DUAL");
                bolletteObject.setDataAutoletturaA("14/9/2021");
                bolletteObject.setDataAutoletturaDa("11/9/2021");
                bolletteObject.setDomiciliazione(true);
                bolletteObject.setEmail("smtest1405@eni.com");
                bolletteObject.setErrorDownloadMetadata(null);
                bolletteObject.setGenericErrorMessage(null);
                bolletteObject.setIndirizzoFornitura("VIA CAIO LELIO, 40 - ROMA (RM)");
                bolletteObject.setNumBolletteNonPagate(0);
                bolletteObject.setNumeroCliente("824853592");
                bolletteObject.setProssimaBolletta(prossimaBolletta);
                bolletteObject.setStatoConto("ATTIVO");
                bolletteObject.setStatoUtente("ATTIVO");
                bolletteObject.setTipoErrore(null);
                bolletteObject.setWidgetVisibile(true);
                break;
        }

        return bolletteObject;
    }

    /**
     * Mock per il servizio estratto conto
     * @return
     */

    public EstrattoContoModel getMockEstrattoConto(String codiceConto){
        // Creazione estratto conto
        EstrattoContoModel estrattoContoModel   = new EstrattoContoModel();
        // Creazione prossima bolletta
        ProssimaBollettaModel prossimaBolletta  = new ProssimaBollettaModel();

        Date dataOdierna = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String dataOdiernaString = formatter.format(dataOdierna);
        
        float debitoTotale              = 0;
        String esitoFattureRateizzabili = "OK";
        float inScadenza                = 0;
        int numBolletteNonPagate        = 0;
        float saldo                     = 0;
        float scaduto                   = 0;
        String situazione               = "regolare";
        String statoConto               = "ATTIVO";
        String statoUtente              = "ATTIVO";
        boolean widgetVisibile          = true;
        
        switch (codiceConto){
            case "505375664792":
                prossimaBolletta.setEmissionePrevista("12/11/2021");
                prossimaBolletta.setMsgEmissioneAlternativa(false);
                prossimaBolletta.setPubblicazionePrevista("20/11/2021");

                estrattoContoModel.setCommodity("GAS");
                estrattoContoModel.setDataOdierna(dataOdiernaString);
                estrattoContoModel.setDebitoTotale(debitoTotale);
                estrattoContoModel.setEsitoFattureRateizzabili(esitoFattureRateizzabili);
                estrattoContoModel.setInScadenza(inScadenza);
                estrattoContoModel.setNumBolletteNonPagate(numBolletteNonPagate);
                estrattoContoModel.setProssimaBolletta(prossimaBolletta);
                estrattoContoModel.setSaldo(saldo);
                estrattoContoModel.setScaduto(scaduto);
                estrattoContoModel.setSituazione(situazione);
                estrattoContoModel.setStatoConto(statoConto);
                estrattoContoModel.setStatoUtente(statoUtente);
                estrattoContoModel.setWidgetVisibile(widgetVisibile);
                break;
            case "505375561741":
                prossimaBolletta.setEmissionePrevista("12/11/2021");
                prossimaBolletta.setMsgEmissioneAlternativa(false);
                prossimaBolletta.setPubblicazionePrevista("20/11/2021");

                estrattoContoModel.setCommodity("POWER");
                estrattoContoModel.setDataOdierna(dataOdiernaString);
                estrattoContoModel.setDebitoTotale(debitoTotale);
                estrattoContoModel.setEsitoFattureRateizzabili(esitoFattureRateizzabili);
                estrattoContoModel.setInScadenza(inScadenza);
                estrattoContoModel.setNumBolletteNonPagate(numBolletteNonPagate);
                estrattoContoModel.setProssimaBolletta(prossimaBolletta);
                estrattoContoModel.setSaldo(saldo);
                estrattoContoModel.setScaduto(scaduto);
                estrattoContoModel.setSituazione(situazione);
                estrattoContoModel.setStatoConto(statoConto);
                estrattoContoModel.setStatoUtente(statoUtente);
                estrattoContoModel.setWidgetVisibile(widgetVisibile);
                break;
            case "505476161227":
                prossimaBolletta.setEmissionePrevista("12/11/2021");
                prossimaBolletta.setMsgEmissioneAlternativa(false);
                prossimaBolletta.setPubblicazionePrevista("20/11/2021");

                estrattoContoModel.setCommodity("DUAL");
                estrattoContoModel.setDataOdierna(dataOdiernaString);
                estrattoContoModel.setDebitoTotale(debitoTotale);
                estrattoContoModel.setEsitoFattureRateizzabili(esitoFattureRateizzabili);
                estrattoContoModel.setInScadenza(inScadenza);
                estrattoContoModel.setNumBolletteNonPagate(numBolletteNonPagate);
                estrattoContoModel.setProssimaBolletta(prossimaBolletta);
                estrattoContoModel.setSaldo(saldo);
                estrattoContoModel.setScaduto(scaduto);
                estrattoContoModel.setSituazione(situazione);
                estrattoContoModel.setStatoConto(statoConto);
                estrattoContoModel.setStatoUtente(statoUtente);
                estrattoContoModel.setWidgetVisibile(widgetVisibile);
                break;
        }

        return  estrattoContoModel;
    }

    /**
     * Mock per il servizio lista forniture
     */
    public List<FornituraModel> getListaForniture(Long codConto){
        //Creazione lista forniture
        List<FornituraModel> listaForniture = new ArrayList<>();

        //TODO popolare lista dinamicamente

        return listaForniture;
    }

    /**
     * Mock per il servizio lista forniture
     */
    public AnagraficaFornitureModel getAnagraficaForniture(String codiceConto){
        AnagraficaFornitureModel anagraficaFornitureModel = new AnagraficaFornitureModel();

        //Creazione lista forniture
        List<FornitureModel> listaForniture = new ArrayList<>();

        FornitureModel fornitura1 = new FornitureModel();
        
        switch (codiceConto){
            case "505375664792":
                fornitura1.setMatricolaContatore("FIOR034421148383");
                fornitura1.setIndirizzoFornitura("VIA ETTORE ARRIGONI DEGLI ODDI 12 ROMA 00169 RM");
                fornitura1.setTipo("GAS");
                fornitura1.setNumeroContratto("1-4840922481");
                fornitura1.setProdotto("Link Gas - GLINK201");
                fornitura1.setConsumoPrevisto("1452");
                fornitura1.setUtilizzo("ACQUA CALDA + COTTURA CIBI + RISCALDAMENTO");
                fornitura1.setPod(null);
                fornitura1.setPdr("00881103500755");
                fornitura1.setAlias(null);
                fornitura1.setDatiCatastali("KO");
                listaForniture.add(fornitura1);
                break;
            case "505375561741":
                fornitura1.setMatricolaContatore("0511620865937");
                fornitura1.setIndirizzoFornitura("VIA ARRIGONI DEGLI ODDI ETTORE 12 ROMA 00169 RM");
                fornitura1.setTipo("POWER");
                fornitura1.setNumeroContratto("1-4834430340");
                fornitura1.setProdotto("Link Luce - LLINKV201");
                fornitura1.setConsumoPrevisto("2000");
                fornitura1.setUtilizzo("");
                fornitura1.setPod("IT002E5790423A");
                fornitura1.setPdr(null);
                fornitura1.setAlias(null);
                fornitura1.setDatiCatastali("KO");
                listaForniture.add(fornitura1);
                break;
            case "505476161227":
                fornitura1.setMatricolaContatore("FIOR034119928898");
                fornitura1.setIndirizzoFornitura("VIA CAIO LELIO 40 ROMA 00175 RM");
                fornitura1.setTipo("GAS");
                fornitura1.setNumeroContratto("1-34029134300");
                fornitura1.setProdotto("Link Gas - GLINK201");
                fornitura1.setConsumoPrevisto("1000");
                fornitura1.setUtilizzo("ACQUA CALDA + COTTURA CIBI");
                fornitura1.setPod(null);
                fornitura1.setPdr("00881101871547");
                fornitura1.setAlias(null);
                fornitura1.setDatiCatastali("KO");
                listaForniture.add(fornitura1);

                FornitureModel fornitura2 = new FornitureModel();
                fornitura2.setMatricolaContatore("REAL_10822767");
                fornitura2.setIndirizzoFornitura("VIA CAIO LELIO 40 ROMA 00175 RM");
                fornitura2.setTipo("POWER");
                fornitura2.setNumeroContratto("1-34029134300");
                fornitura2.setProdotto("Link Luce - LLINKV201");
                fornitura2.setConsumoPrevisto("1000");
                fornitura2.setUtilizzo("");
                fornitura2.setPod("IT002E1425415A");
                fornitura2.setPdr(null);
                fornitura2.setAlias(null);
                fornitura2.setDatiCatastali("KO");
                listaForniture.add(fornitura2);
                break;
        }
        
        anagraficaFornitureModel.setForniture(listaForniture);
        
        return anagraficaFornitureModel;
    }

    /**
     * * Genera una bolletta con valori casuali
     * @param dataEmissione data di emissione della bolletta
     * @param dataScadenza data di scadenza della bolletta
     * @return
     */
    private BollettaModel createMockBolletta(String dataEmissione, String dataScadenza)
    {
        // Genera un codice bollettino casuale di 3 caratteri con lo 0 davanti
        String codiceBollettino = "0" + GenerateRandomNumber(3);
        // Generazione di un id fattura casuale di 9 caratteri
        String idFattura = GenerateRandomNumber(9);
        // Generazione di un id protocollo pdf casuale di 9 caratteri
        String idProtocolloPDF = GenerateRandomNumber(9);
        // Generazione di un importo casuale di 3 cifre con 2 decimali
        String importo = GenerateRandomNumber(3) + "." + GenerateRandomNumber(2);
        // Generazione di un numero bolletta casuale di 10 cifre
        String numeroBolletta = GenerateRandomNumber(10);
        // Rate (null)
        List<RataFatturaRateizzataModel> rateModel = null;

        BollettaModel bollettaModel = new BollettaModel();
        bollettaModel.setBillingSystemName(null);
        bollettaModel.setBollettaSmart(null);
        bollettaModel.setCodiceAzienda(null);
        bollettaModel.setCodiceBollettino(codiceBollettino);
        bollettaModel.setDataElaborazioneLettera(Long.valueOf("-2208992400000"));
        bollettaModel.setEmissione(dataEmissione);
        bollettaModel.setFatturaRateizzata("N");
        bollettaModel.setFlDefaultDataElaborazioneLettera(false);
        bollettaModel.setIdFattura(idFattura);
        bollettaModel.setIdProtocolloDocPdf(idProtocolloPDF);
        bollettaModel.setImporto(Float.valueOf(importo));
        bollettaModel.setImportoPagare("0.0");
        bollettaModel.setImportoSIA(null);
        bollettaModel.setImportoVersato(Float.valueOf(importo));
        bollettaModel.setLinkPagaOnline("");
        bollettaModel.setMac(null);
        bollettaModel.setNonPagabileSIA(false);
        bollettaModel.setNumeroOrdine(numeroBolletta);
        bollettaModel.setNumeroOrdine(null);
        bollettaModel.setNumPagina("1");
        bollettaModel.setOptions(null);
        bollettaModel.setPubblicazione(dataEmissione);
        bollettaModel.setRate(rateModel);
        bollettaModel.setRatePresenti(false);
        bollettaModel.setScadenza(dataScadenza);
        bollettaModel.setStatoBollettaView(StatoBollettaView.VISIBILE);
		bollettaModel.setStatoPagamento("PAGATA");
		bollettaModel.setUrlBack(null);
		bollettaModel.setUrlDone(null);
		bollettaModel.setUrlMs(null);
        bollettaModel.setRedirectPage(null);

        return bollettaModel;
    }

    /**
     * Metodo per la generazione di un numeo casuale di una data lunghezza
     * @param charLength
     * @return
     */
    String GenerateRandomNumber(int charLength) 
    {
        return String.valueOf(charLength < 1 ? 0 : new Random()
                .nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
                + (int) Math.pow(10, charLength - 1));
    }
}
