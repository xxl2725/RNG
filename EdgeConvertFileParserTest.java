import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;
import java.util.*;
import javax.swing.*;
public class EdgeConvertFileParserTest{
	  EdgeConvertFileParser testFile;
	  EdgeTable[] table;
	  EdgeField[] field;

	  @Before
	  public void setUp() throws Exception{
	    File file=new File("EdgeConvertGUI.java");
	    testFile= new EdgeConvertFileParser(file);
	    runner();
	  }
	  public void runner(){
               testGetEdgeTables();
	       testGetEdgeFields();
	  }
    
	  public void testGetEdgeTables(){
	    assertEquals("Test for EdgeTable",table,testFile.getEdgeTables());
	  }
	  public void testGetEdgeFields(){
	    assertEquals("Test for EdgeField",field,testFile.getEdgeFields());

	  }





}
