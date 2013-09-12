

/* First created by JCasGen Tue Sep 10 16:32:40 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Sep 11 22:05:28 EDT 2013
 * XML source: C:/Users/James_He/git/hw1-jiacongh/hw1-jiacongh/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class AnnotationBase extends Annotation {
  public int begin;
  public int end;
  public String source;
  public double confidence;
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(AnnotationBase.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected AnnotationBase() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public AnnotationBase(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public AnnotationBase(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public AnnotationBase(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
  //*--------------*
  //* Feature: TestElementAnnotation

  /** getter for TestElementAnnotation - gets The beginning class when initiated
   * @generated */
  public AnnotationBase getTestElementAnnotation() {
    if (AnnotationBase_Type.featOkTst && ((AnnotationBase_Type)jcasType).casFeat_TestElementAnnotation == null)
      jcasType.jcas.throwFeatMissing("TestElementAnnotation", "AnnotationBase");
    return (AnnotationBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((AnnotationBase_Type)jcasType).casFeatCode_TestElementAnnotation)));}
    
  /** setter for TestElementAnnotation - sets The beginning class when initiated 
   * @generated */
  public void setTestElementAnnotation(AnnotationBase v) {
    if (AnnotationBase_Type.featOkTst && ((AnnotationBase_Type)jcasType).casFeat_TestElementAnnotation == null)
      jcasType.jcas.throwFeatMissing("TestElementAnnotation", "AnnotationBase");
    jcasType.ll_cas.ll_setRefValue(addr, ((AnnotationBase_Type)jcasType).casFeatCode_TestElementAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    