/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static rc.soop.action.ActionB.preparefilefordownload;
import static rc.soop.action.ActionB.preparefileforupload;
import static rc.soop.action.Pdf_new.allegatoC;
import static rc.soop.action.Pdf_new.extractSignatureInformation_P7M;
import static rc.soop.action.Pdf_new.nullaosta;
import rc.soop.db.Db_Bando;
import rc.soop.entity.Docuserconvenzioni;
import rc.soop.entity.FileDownload;
import rc.soop.entity.SignedDoc;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.commons.io.FileUtils.readFileToByteArray;
import static org.apache.commons.io.FilenameUtils.getExtension;
import org.joda.time.DateTime;
import rc.soop.action.ActionB;
import rc.soop.action.Constant;
import static rc.soop.util.SendMailJet.sendMailListAttach;
import static rc.soop.util.Utility.getRequestValue;

/**
 *
 * @author Administrator
 */
public class NewFile {

    public static void main(String[] args) {
        
        try {
            
//            String username= "ADIBEN0622";
            
            List<String> userslist = new ArrayList<>();
            
            userslist.add("ADIBEN0622");
            userslist.add("ALARI7277");
            userslist.add("AMANUN8385");
            userslist.add("BCULLA0838");
            userslist.add("CTRIAR5660");
            userslist.add("DBONFI3376");
            userslist.add("DLAPIC1505");
            userslist.add("ECARUL7877");
            userslist.add("MTRIEL1081");
//             Db_Bando db = new Db_Bando();
//            String protocollo = db.getProtocolloDomandaInviata(username).toUpperCase();
//            String ragsoc = db.getRagioneSociale(username).toUpperCase();
//            String text = db.getPath("mail.invioconvenzione.roma").replaceAll("@prot", protocollo).replaceAll("@ragsoc", ragsoc);
//            db.closeDB();
            
for(String username:userslist){
            System.out.println("test.NewFile.main() "+allegatoC(username).getPath());
    
}
            
//            
//            String to[] = {"raffaele.cosco@smartoop.it"};
//            String cc[] = {"info@smartoop.it"};
//            
//            List<FileDownload> listafiledainviare = ActionB.lista_file_Convenzione(username, protocollo, ragsoc);
//            
//            boolean mailok = sendMailListAttach(
//                    Constant.nomevisual, to, cc, text,
//                    Constant.nomevisual + " - Invio convenzione da parte del Soggetto Attuatore: " + ragsoc,
//                    listafiledainviare,username);
//            System.out.println("test.NewFile.main() "+mailok);
            
//            System.out.println(getExtension(new File("C:\\Users\\Administrator\\Desktop\\da caricare\\FMIGLI2000171020220947443.A_All.A.pdf.p7m").getName()));
//            
//            SignedDoc dc = extractSignatureInformation_P7M(readFileToByteArray(new File("C:\\Users\\Administrator\\Desktop\\da caricare\\FMIGLI2000171020220947443.A_All.A.pdf.p7m")));
//            System.out.println("test.NewFile.main() "+dc.getCodicefiscale());
//            System.out.println("test.NewFile.main() "+dc.getErrore());
//            System.out.println("test.NewFile.main() "+dc.isValido());
////        File out1 = allegatoC("FVALOC6567");
////        System.out.println(out1.getPath());
//
//        String username = "DMARRE0776";
//        Db_Bando db = new Db_Bando();
//        ArrayList<Docuserconvenzioni> aldocumenti = db.getDocumentiConvenzioni(username);
//        String protocollo = db.getProtocolloDomandaInviata(username).toUpperCase();
//        String ragsoc = db.getRagioneSociale(username).toUpperCase();
//        db.closeDB();
//        Docuserconvenzioni conv = aldocumenti.stream().filter(d1 -> d1.getCodicedoc().contains("CONV")).findAny().orElse(null);
//        if (conv != null) {
//            File nullaosta = nullaosta(username, protocollo, ragsoc, new DateTime());
//            System.out.println(nullaosta.getPath());
//        }
//        
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
