
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

/** 
 * Updated by JCasGen Wed Sep 11 22:05:29 EDT 2013
 * @generated */
public class TokenListAnnotation_Type extends AnnotationBase_Type {
  /** @generated */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (TokenListAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = TokenListAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new TokenListAnnotation(addr, TokenListAnnotation_Type.this);
  			   TokenListAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new TokenListAnnotation(addr, TokenListAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = TokenListAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("TokenListAnnotation");



  /** @generated */
  final Feature casFeat_ScoreAnnotation;
  /** @generated */
  final int     casFeatCode_ScoreAnnotation;
  /** @generated */ 
  public int getScoreAnnotation(int addr) {
        if (featOkTst && casFeat_ScoreAnnotation == null)
      jcas.throwFeatMissing("ScoreAnnotation", "TokenListAnnotation");
    return ll_cas.ll_getRefValue(addr, casFeatCode_ScoreAnnotation);
  }
  /** @generated */    
  public void setScoreAnnotation(int addr, int v) {
        if (featOkTst && casFeat_ScoreAnnotation == null)
      jcas.throwFeatMissing("ScoreAnnotation", "TokenListAnnotation");
    ll_cas.ll_setRefValue(addr, casFeatCode_ScoreAnnotation, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	* @generated */
  public TokenListAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_ScoreAnnotation = jcas.getRequiredFeatureDE(casType, "ScoreAnnotation", "AnnotationBase", featOkTst);
    casFeatCode_ScoreAnnotation  = (null == casFeat_ScoreAnnotation) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_ScoreAnnotation).getCode();

  }
}



    