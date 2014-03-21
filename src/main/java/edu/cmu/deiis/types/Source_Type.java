
/* First created by JCasGen Fri Mar 21 03:19:04 CST 2014 */
package edu.cmu.deiis.types;

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
 * Updated by JCasGen Fri Mar 21 03:33:39 CST 2014
 * @generated */
public class Source_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (Source_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = Source_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new Source(addr, Source_Type.this);
  			   Source_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new Source(addr, Source_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Source.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("edu.cmu.deiis.types.Source");



  /** @generated */
  final Feature casFeat_path;
  /** @generated */
  final int     casFeatCode_path;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getPath(int addr) {
        if (featOkTst && casFeat_path == null)
      jcas.throwFeatMissing("path", "edu.cmu.deiis.types.Source");
    return ll_cas.ll_getStringValue(addr, casFeatCode_path);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPath(int addr, String v) {
        if (featOkTst && casFeat_path == null)
      jcas.throwFeatMissing("path", "edu.cmu.deiis.types.Source");
    ll_cas.ll_setStringValue(addr, casFeatCode_path, v);}
    
  
 
  /** @generated */
  final Feature casFeat_type_source;
  /** @generated */
  final int     casFeatCode_type_source;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getType_source(int addr) {
        if (featOkTst && casFeat_type_source == null)
      jcas.throwFeatMissing("type_source", "edu.cmu.deiis.types.Source");
    return ll_cas.ll_getStringValue(addr, casFeatCode_type_source);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setType_source(int addr, String v) {
        if (featOkTst && casFeat_type_source == null)
      jcas.throwFeatMissing("type_source", "edu.cmu.deiis.types.Source");
    ll_cas.ll_setStringValue(addr, casFeatCode_type_source, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Source_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_path = jcas.getRequiredFeatureDE(casType, "path", "uima.cas.String", featOkTst);
    casFeatCode_path  = (null == casFeat_path) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_path).getCode();

 
    casFeat_type_source = jcas.getRequiredFeatureDE(casType, "type_source", "uima.cas.String", featOkTst);
    casFeatCode_type_source  = (null == casFeat_type_source) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_type_source).getCode();

  }
}



    