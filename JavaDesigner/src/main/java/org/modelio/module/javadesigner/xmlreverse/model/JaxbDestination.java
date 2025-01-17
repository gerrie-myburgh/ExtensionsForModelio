//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.10.27 at 01:27:01 PM CEST
//
package org.modelio.module.javadesigner.xmlreverse.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.modelio.module.javadesigner.xmlreverse.model.defaultvisitor.IReverseModelVisitor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 * &lt;complexContent>
 * &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 * &lt;attribute name="package" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="template-parameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="feature" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="parameter" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="refid" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "destination")
public class JaxbDestination implements IVisitorElement {
    
    @XmlAttribute(name = "package")
    protected String _package;

    
    @XmlAttribute(name = "class")
    protected String clazz;

    
    @XmlAttribute(name = "template-parameter")
    protected String templateParameter;

    
    @XmlAttribute
    protected String feature;

    
    @XmlAttribute
    protected String parameter;

    
    @XmlAttribute
    protected String refid;

    /**
     * Gets the value of the package property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getPackage() {
        return this._package;
    }

    /**
     * Sets the value of the package property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setPackage(final String value) {
        this._package = value;
    }

    /**
     * Gets the value of the clazz property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getClazz() {
        return this.clazz;
    }

    /**
     * Sets the value of the clazz property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setClazz(final String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the templateParameter property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getTemplateParameter() {
        return this.templateParameter;
    }

    /**
     * Sets the value of the templateParameter property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setTemplateParameter(final String value) {
        this.templateParameter = value;
    }

    /**
     * Gets the value of the feature property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getFeature() {
        return this.feature;
    }

    /**
     * Sets the value of the feature property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setFeature(final String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the parameter property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getParameter() {
        return this.parameter;
    }

    /**
     * Sets the value of the parameter property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setParameter(final String value) {
        this.parameter = value;
    }

    /**
     * Gets the value of the refid property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getRefid() {
        return this.refid;
    }

    /**
     * Sets the value of the refid property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setRefid(final String value) {
        this.refid = value;
    }

    
    @Override
    public Object accept(final IReverseModelVisitor visitor) {
        return visitor.visitDestination(this);
    }

}
