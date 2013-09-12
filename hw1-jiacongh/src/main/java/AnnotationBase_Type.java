
/* First created by JCasGen Tue Sep 10 16:32:40 EDT 2013 */

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Sep 11 22:05:28 EDT 2013
 * @generated */
public class AnnotationBase_Type extends Annotation_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (AnnotationBase_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = AnnotationBase_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new AnnotationBase(addr, AnnotationBase_Type.this);
  			   AnnotationBase_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new AnnotationBase(addr, AnnotationBase_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = AnnotationBase.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("AnnotationBase");



  /** @generated */
  final Feature casFeat_TestElementAnnotation;
  /** @generated */
  final int     casFeatCode_TestElementAnnotation;
  /** @generated */ 
  public int getTestElementAnnotation(int addr) {
        if (featOkTst && casFeat_TestElementAnnotation == null)
      jcas.throwFeatMissing("TestElementAnnotation", "AnnotationBase");
    return ll_cas.ll_getRefValue(addr, casFeatCode_TestElementAnnotation);
  }
  /** @generated */    
  public void setTestElementAnnotation(int addr, int v) {
        if (featOkTst && casFeat_TestElementAnnotation == null)
      jcas.throwFeatMissing("TestElementAnnotation", "AnnotationBase");
    ll_cas.ll_setRefValue(addr, casFeatCode_TestElementAnnotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public AnnotationBase_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_TestElementAnnotation = jcas.getRequiredFeatureDE(casType, "TestElementAnnotation", "AnnotationBase", featOkTst);
    casFeatCode_TestElementAnnotation  = (null == casFeat_TestElementAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_TestElementAnnotation).getCode();

  }
}



    