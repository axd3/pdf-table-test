package de.muenchen.pdftable;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.URL;

public class FastTest {

    @Test
    public void createPdf () throws IOException {
        OutputStream os = new FileOutputStream("bar.pdf");
        URL resource = this.getClass().getResource("/templates/openhtmltopdf-example.html");
        PdfRendererBuilder builder = new PdfRendererBuilder();
        builder.useFastMode();
        builder.usePdfVersion(1.7f);
        builder.withUri("file:///" + resource.getPath());
        builder.toStream(os);
        builder.run();
    }
}
