//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1-b02-fcs
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2010.10.27 at 01:27:01 PM CEST
//
package org.modelio.module.javadesigner.xmlreverse.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 * &lt;choice maxOccurs="unbounded" minOccurs="0">
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}stereotype"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}tagged-value"/>
 * &lt;element ref="{http://www.modeliosoft.com/rev-modele.xsd}content"/>
 * &lt;/choice>
 * &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;attribute name="note-type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 * &lt;/restriction>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stereotypeOrTaggedValueOrContent"
})
@XmlRootElement(name = "note")
public class JaxbNote implements IVisitorElement {
    
    @XmlAttribute
    protected String name;

    
    @XmlAttribute(name = "note-type", required = true)
    protected String noteType;

    
    @XmlElements({
    @XmlElement(name = "stereotype", type = JaxbStereotype.class),
    @XmlElement(name = "tagged-value", type = JaxbTaggedValue.class),
    @XmlElement(name = "content", type = String.class)
})
    protected List<Object> stereotypeOrTaggedValueOrContent;

    /**
     * Gets the value of the stereotypeOrTaggedValueOrContent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stereotypeOrTaggedValueOrContent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     * getStereotypeOrTaggedValueOrContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JaxbStereotype }
     * {@link JaxbTaggedValue }
     * {@link String }
     */
    
    public List<Object> getStereotypeOrTaggedValueOrContent() {
        if (this.stereotypeOrTaggedValueOrContent == null) {
            this.stereotypeOrTaggedValueOrContent = new ArrayList<>();
        }
        return this.stereotypeOrTaggedValueOrContent;
    }

    /**
     * Gets the value of the name property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getName() {
        return this.name;
    }

    /**
     * Sets the value of the name property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setName(final String value) {
        this.name = value;
    }

    /**
     * Gets the value of the noteType property.
     * @return
     * possible object is
     * {@link String }
     */
    
    public String getNoteType() {
        return this.noteType;
    }

    /**
     * Sets the value of the noteType property.
     * @param value allowed object is
     * {@link String }
     */
    
    public void setNoteType(final String value) {
        this.noteType = value;
    }

    
    @Override
    public Object accept(final IReverseModelVisitor visitor) {
        return visitor.visitNote(this);
    }

}
