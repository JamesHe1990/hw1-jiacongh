

/* First created by JCasGen Tue Sep 10 16:32:40 EDT 2013 */

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



/** 
 * Updated by JCasGen Wed Sep 11 22:05:29 EDT 2013
 * XML source: C:/Users/James_He/git/hw1-jiacongh/hw1-jiacongh/src/main/resources/typeSystemDescriptor.xml
 * @generated */
public class TokenListAnnotation extends AnnotationBase {
  public String tokenListID;
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TokenListAnnotation.class);
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
  protected TokenListAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TokenListAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TokenListAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TokenListAnnotation(JCas jcas, int begin, int end) {
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
  //* Feature: ScoreAnnotation

  /** getter for ScoreAnnotation - gets The system will incorporate a component that will assign an answer score annotation to each answer. The answer score annotation will record the score assigned to the answer.
   * @generated */
  public AnnotationBase getScoreAnnotation() {
    if (TokenListAnnotation_Type.featOkTst && ((TokenListAnnotation_Type)jcasType).casFeat_ScoreAnnotation == null)
      jcasType.jcas.throwFeatMissing("ScoreAnnotation", "TokenListAnnotation");
    return (AnnotationBase)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((TokenListAnnotation_Type)jcasType).casFeatCode_ScoreAnnotation)));}
    
  /** setter for ScoreAnnotation - sets The system will incorporate a component that will assign an answer score annotation to each answer. The answer score annotation will record the score assigned to the answer. 
   * @generated */
  public void setScoreAnnotation(AnnotationBase v) {
    if (TokenListAnnotation_Type.featOkTst && ((TokenListAnnotation_Type)jcasType).casFeat_ScoreAnnotation == null)
      jcasType.jcas.throwFeatMissing("ScoreAnnotation", "TokenListAnnotation");
    jcasType.ll_cas.ll_setRefValue(addr, ((TokenListAnnotation_Type)jcasType).casFeatCode_ScoreAnnotation, jcasType.ll_cas.ll_getFSRef(v));}    
  }

    