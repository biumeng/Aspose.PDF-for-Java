package com.aspose.pdf.examples.AsposePdf.Annotations;

import com.aspose.pdf.examples.Utils;

public class DeleteParticularAnnotation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DeleteParticularAnnotation.class);

        //open source PDF document
        com.aspose.pdf.Document pdfDocument = new com.aspose.pdf.Document(dataDir + "input.pdf");

        //delete particular annotation
        pdfDocument.getPages().get_Item(1).getAnnotations().delete(1);

        // save the update document
        pdfDocument.save(dataDir + "output.pdf");

        // Display result.
        System.out.println("Process Completed Successfully!");
    }
}

