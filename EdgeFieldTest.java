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
     // testSetTableID();
      testGetTableBound();
     // testSetTableBound();
      testGetFieldBound();
     // testSetFieldBound();
      testGetDisallowNull();
     // testSetDisallowNull();
      testGetIsPrimaryKey();
     // testSetIsPrimaryKey();
      testGetDefaultValue();
     // testSetDefaultValue();
      testGetVarcharValue();
     // testSetVarcharValue();
      testGetDataType();
     // testSetDataType();
      testToString();
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
      testObj.setTableID(3);
      assertEquals("setTable is set to 3 so it should be 3",3,testObj.getTableID());
   }
   
   @Test
   public void testGetTableBound(){
      assertEquals("tableBound was intialized to 0 so it should be 0",0,testObj.getTableBound());
   }
   
   @Test
   public void testSetTableBound(){
      testObj.setTableBound(2);
      assertEquals("TableBound is set to 2 so it should be 2",2,testObj.getTableBound());
   }
   
   @Test
   public void testGetFieldBound(){
      assertEquals("FieldBound was intialized to 0 so it should be 0",0,testObj.getFieldBound());
   }
   
   @Test
   public void testSetFieldBound(){
      testObj.setFieldBound(2);
      assertEquals("FieldBound is set to 2 so it should be 2",2,testObj.getFieldBound());
   }
   
   @Test
   public void testGetDisallowNull(){
      assertEquals("DisallowNull was intialized to false so it should be false",false,testObj.getDisallowNull());
   }
   
   @Test
   public void testSetDisallowNull(){
      testObj.setDisallowNull(true);
      assertEquals("DisallowNull is set to true so it should be true ",true,testObj.getDisallowNull());
   }
   
   @Test
   public void testGetIsPrimaryKey(){
      assertEquals("IsPrimaryKey was intialized to false so it should be false",false,testObj.getIsPrimaryKey());
   }
   
   @Test
   public void testSetIsPrimaryKey(){
      testObj.setIsPrimaryKey(true);
      assertEquals("IsPrimaryKey is set to true it should be true",true,testObj.getIsPrimaryKey());
   }
   
   @Test
   public void testGetDefaultValue(){
      assertEquals("DefaultValue was intialized to so it should be ","",testObj.getDefaultValue());
   }
   
   @Test
   public void testSetDefaultValue(){
      testObj.setDefaultValue("test");
      assertEquals("DefaultValue should be what you set it to","test",testObj.getDefaultValue());
   }
   
   @Test
   public void testGetVarcharValue(){
      assertEquals("VarcharValue was intialized to 1 so it should be 1",1,testObj.getVarcharValue());
   }
   @Test
   public void testSetVarcharValue(){
      testObj.setVarcharValue(2);
      assertEquals("VarcharValue should be what you set it to 2",2,testObj.getVarcharValue());
   }
   
   @Test
   public void testGetDataType(){
      assertEquals("DataType was intialized to 0 so it should be 0",0,testObj.getDataType());
   }
   
   @Test
   public void testSetDataType(){
      testObj.setDataType(1);
      assertEquals("DataType should be what you set it to",1,testObj.getDataType());
   }
   
   @Test
   public void testGetStrDataType(){
      String[] test = {"Varchar", "Boolean", "Integer", "Double"};
      assertEquals("strDataType should have varchar, boolean, integer, and double so the it should be same as the array we create",test,testObj.getStrDataType());
   }
   
   
   
   @Test
   public void testToString(){
      String test = testObj.getNumFigure() + EdgeConvertFileParser.DELIM +
         testObj.getName() + EdgeConvertFileParser.DELIM +
         testObj.getTableID() + EdgeConvertFileParser.DELIM +
         testObj.getTableBound() + EdgeConvertFileParser.DELIM +
         testObj.getFieldBound() + EdgeConvertFileParser.DELIM +
         testObj.getDataType() + EdgeConvertFileParser.DELIM +
         testObj.getVarcharValue() + EdgeConvertFileParser.DELIM +
         testObj.getIsPrimaryKey() + EdgeConvertFileParser.DELIM +
         testObj.getDisallowNull() + EdgeConvertFileParser.DELIM +
         testObj.getDefaultValue();
         
      assertEquals("toString should same",test,testObj.toString());
   
      
   }
 
   
     


}
