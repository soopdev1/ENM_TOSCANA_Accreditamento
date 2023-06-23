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
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.apache.commons.io.FileUtils.readFileToByteArray;
import static org.apache.commons.io.FilenameUtils.getExtension;
import org.joda.time.DateTime;

/**
 *
 * @author Administrator
 */
public class NewFile {

    public static void main(String[] args) {
        
        try {
            
            System.out.println(getExtension(new File("C:\\Users\\Administrator\\Desktop\\da caricare\\FMIGLI2000171020220947443.A_All.A.pdf.p7m").getName()));
            
            SignedDoc dc = extractSignatureInformation_P7M(readFileToByteArray(new File("C:\\Users\\Administrator\\Desktop\\da caricare\\FMIGLI2000171020220947443.A_All.A.pdf.p7m")));
            System.out.println("test.NewFile.main() "+dc.getCodicefiscale());
            System.out.println("test.NewFile.main() "+dc.getErrore());
            System.out.println("test.NewFile.main() "+dc.isValido());
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
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
