/*
 * Developed by Guilherme Nassi
 * Do not remove this header
 * You can use this code as long as this header is in it.
 */

package code;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import modelosBean.requisicaoCompleta;

/**
 *
 * @author guidi
 */

public class criaPDF {

    /**
     * generates a PDF for the 
     * @param m 
     */
    public static void criaFIchaEPI(ArrayList <requisicaoCompleta> m ){
        try{
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("documento.pdf"));
        document.open();
        document.add(new Paragraph("Teste de um parágrafo simplório "));
        document.close();
        }catch(DocumentException | FileNotFoundException e){
            System.out.println(e);
        }
        
        
        
    }
}
