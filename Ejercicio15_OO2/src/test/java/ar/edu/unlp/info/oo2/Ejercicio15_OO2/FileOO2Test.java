package ar.edu.unlp.info.oo2.Ejercicio15_OO2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileOO2Test {
	private FileOO2 fileWithDecorators;
	private FileOO2 fileWithoutDecorators;

    @BeforeEach
    void setUp() throws Exception {
    	FileOO2 file1 = new File("archivoDecorador"," .txt", 25.3, LocalDate.of(2024, 1, 10), LocalDate.of(2024, 3, 10), "varios permisos");
    	FileOO2 file2 = new ExtensionDecorator(file1);
    	FileOO2 file3 = new TamañoDecorator(file2);
    	this.fileWithDecorators = new NombreDecorator(file3);
    	this.fileWithoutDecorators = new File("archivoComun",".ppt", 40.2, LocalDate.of(2024, 2, 8), LocalDate.of(2024, 3, 20), "sin permisos");
    }
    
    @Test 
    void TestPrettyPrintSinDecorador() {
    	assertEquals("", this.fileWithoutDecorators.prettyPrint());
    }
    
    @Test
    void TestPrettyPrintConDecoradores() {
    	assertEquals("archivoDecorador 25.3  .txt ", this.fileWithDecorators.prettyPrint());
    }
}