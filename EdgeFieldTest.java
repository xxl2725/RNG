import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;



public class EdgeFieldTest{
   EdgeField testObj;
   
   @Before
   public void setUp() throws Exception{
      testObj = new EdgeField("1|test");
      runner();
   }
   public void runner(){
      testGetNumFigure();
      testGetName();
      testGetTableID();
      testSetTableID();
      testGetTableBound();
      testSetTableBound();
      testGetFieldBound();
      testSetFieldBound();
      testGetDisallowNull();
      testSetDisallowNull();
      testGetIsPrimaryKey();
      testSetIsPrimaryKey();
      testGetDefaultValue();
      testSetDefaultValue();
      testGetVarcharValue();
      testSetVarcharValue();
      testGetDataType();
      testSetDataType();
   }
   
   @Test
   public void testGetNumFigure(){
      assertEquals("numFigure was intialized to 1 so it should be 1",1,testObj.getNumFigure());
   }

   @Test
   public void testGetName(){
     assertEquals("name was intialized to test so it should be test","test",testObj.getName());
   }

   @Test
   public void testGetTableID(){
    assertEquals("TableID was intialized to 0 so it should be 0",0,testObj.getTableID());
   }
     @Test
   public void testSetTableID(){
      assertEquals("setTable should be what you set it to",0,testObj.getTableID());
   }
   
   @Test
   public void testGetTableBound(){
      assertEquals("tableBound was intialized to 0 so it should be 0",0,testObj.getTableBound());
   }
   
   @Test
   public void testSetTableBound(){
      assertEquals("TableBound should be what you set it to",0,testObj.getTableBound());
   }
   
   @Test
   public void testGetFieldBound(){
      assertEquals("FieldBound was intialized to 0 so it should be 0",0,testObj.getFieldBound());
   }
   
   @Test
   public void testSetFieldBound(){
      assertEquals("FieldBound should be what you set it to",0,testObj.getFieldBound());
   }
   
   @Test
   public void testGetDisallowNull(){
      assertEquals("DisallowNull was intialized to false so it should be false",false,testObj.getDisallowNull());
   }
   
   @Test
   public void testSetDisallowNull(){
      assertEquals("DisallowNull should be what you set it to",false,testObj.getDisallowNull());
   }
   
   @Test
   public void testGetIsPrimaryKey(){
      assertEquals("IsPrimaryKey was intialized to false so it should be false",false,testObj.getIsPrimaryKey());
   }
   
   @Test
   public void testSetIsPrimaryKey(){
      assertEquals("IsPrimaryKey should be what you set it to",false,testObj.getIsPrimaryKey());
   }
   
   @Test
   public void testGetDefaultValue(){
      assertEquals("DefaultValue was intialized to so it should be ","",testObj.getDefaultValue());
   }
   
   @Test
   public void testSetDefaultValue(){
      assertEquals("DefaultValue should be what you set it to","",testObj.getDefaultValue());
   }
   
   @Test
   public void testGetVarcharValue(){
      assertEquals("VarcharValue was intialized to 1 so it should be 1",1,testObj.getVarcharValue());
   }
   @Test
   public void testSetVarcharValue(){
      assertEquals("DefaultValue should be what you set it to","",testObj.getDefaultValue());
   }
   
   @Test
   public void testGetDataType(){
      assertEquals("DataType was intialized to 0 so it should be 0",0,testObj.getDataType());
   }
   
   @Test
   public void testSetDataType(){
      assertEquals("DataType should be what you set it to",0,testObj.getDataType());
   }

  


}
