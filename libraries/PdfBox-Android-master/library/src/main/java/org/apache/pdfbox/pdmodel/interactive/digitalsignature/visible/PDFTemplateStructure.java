/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSDictionary;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdfwriter.COSWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.common.PDStream;
import org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary;
import org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDFieldTreeNode;
import org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField;
import org.apache.pdfbox.util.awt.AffineTransform;

/**
 * Structure of PDF document with visible signature.
 * 
 * @author Vakhtang Koroghlishvili
 */
public class PDFTemplateStructure
{
    private PDPage page;
    private PDDocument template;
    private PDAcroForm acroForm;
    private PDSignatureField signatureField;
    private PDSignature pdSignature;
    private COSDictionary acroFormDictionary;
    private PDRectangle singatureRectangle;
    private AffineTransform affineTransform;
    private COSArray procSet;
    private PDImageXObject image;
    private PDRectangle formaterRectangle;
    private PDStream holderFormStream;
    private PDResources holderFormResources;
    private PDFormXObject holderForm;
    private PDAppearanceDictionary appearanceDictionary;
    private PDStream innterFormStream;
    private PDResources innerFormResources;
    private PDFormXObject innerForm;
    private PDStream imageFormStream;
    private PDResources imageFormResources;
    private List<PDFieldTreeNode> acroFormFields;
    private COSName innerFormName;
    private COSName imageFormName;
    private COSName imageName;
    private COSDocument visualSignature;
    private PDFormXObject imageForm;
    private COSDictionary widgetDictionary;

    /**
     * Returns document page.
     * @return the page
     */
    public PDPage getPage()
    {
        return page;
    }

    /**
     * Sets document page
     * @param page
     */
    public void setPage(PDPage page)
    {
        this.page = page;
    }

    /**
     * Gets PDDocument template.
     * This represents a digital signature
     *  that can be attached to a document
     * @return the template
     */
    public PDDocument getTemplate()
    {
        return template;
    }

    /**
     * Wets PDDocument template.
     * This represents a digital signature
     * that can be attached to a document
     * @param template
     */
    public void setTemplate(PDDocument template)
    {
        this.template = template;
    }

    /**
     * Gets AcroForm
     * @return the AcroForm
     */
    public PDAcroForm getAcroForm()
    {
        return acroForm;
    }

    /**
     * Sets AcroForm
     * @param acroForm
     */
    public void setAcroForm(PDAcroForm acroForm)
    {
        this.acroForm = acroForm;
    }

    /**
     * Gets Signature field
     * @return the signature field
     */
    public PDSignatureField getSignatureField()
    {
        return signatureField;
    }

    /**
     * Sets signature field
     * @param signatureField
     */
    public void setSignatureField(PDSignatureField signatureField)
    {
        this.signatureField = signatureField;
    }

    /**
     * Gets PDSignature
     * @return the signature
     */
    public PDSignature getPdSignature()
    {
        return pdSignature;
    }

    /**
     * Sets PDSignatureField
     * @param pdSignature
     */
    public void setPdSignature(PDSignature pdSignature)
    {
        this.pdSignature = pdSignature;
    }

    /**
     * Gets Dictionary of AcroForm. Thats <b> /DR </b>
     * entry in the AcroForm
     * @return the AcroForm's dictionary 
     */
    public COSDictionary getAcroFormDictionary()
    {
        return acroFormDictionary;
    }

    /**
     * Acroform have its Dictionary, so we here set
     * the Dictionary  which is in this location:
     * <b> AcroForm/DR <b>
     * @param acroFormDictionary
     */
    public void setAcroFormDictionary(COSDictionary acroFormDictionary)
    {
        this.acroFormDictionary = acroFormDictionary;
    }

    /**
     * Gets SignatureRectangle
     * @return the rectangle for the signature
     */
    public PDRectangle getSingatureRectangle()
    {
        return singatureRectangle;
    }

    /**
     * Sets SignatureRectangle
     * @param singatureRectangle
     */
    public void setSignatureRectangle(PDRectangle singatureRectangle)
    {
        this.singatureRectangle = singatureRectangle;
    }

    /**
     * Gets AffineTransform
     * @return the AffineTransform
     */
    public AffineTransform getAffineTransform()
    {
        return affineTransform;
    }

    /**
     * Sets AffineTransform
     * @param affineTransform
     */
    public void setAffineTransform(AffineTransform affineTransform)
    {
        this.affineTransform = affineTransform;
    }

    /**
     * Gets ProcSet Array
     * @return the PorocSet array
     */
    public COSArray getProcSet()
    {
        return procSet;
    }

    /**
     * Sets ProcSet Array
     * @param procSet
     */
    public void setProcSet(COSArray procSet)
    {
        this.procSet = procSet;
    }

    /**
     * Gets the image of visible signature
     * @return the image making up the visible signature
     */
    public PDImageXObject getImage()
    {
        return image;
    }

    /**
     * Sets the image of visible signature
     * @param image Image XObject
     */
    public void setImage(PDImageXObject image)
    {
        this.image = image;
    }

    /**
     * Gets formatter rectangle
     * @return the formatter rectangle
     */
    public PDRectangle getFormaterRectangle()
    {
        return formaterRectangle;
    }

    /**
     * Sets formatter rectangle
     * @param formaterRectangle
     */
    public void setFormaterRectangle(PDRectangle formaterRectangle)
    {
        this.formaterRectangle = formaterRectangle;
    }

    /**
     * Sets HolderFormStream
     * @return the holder form stream
     */
    public PDStream getHolderFormStream()
    {
        return holderFormStream;
    }

    /**
     * Sets stream of holder form Stream 
     * @param holderFormStream
     */
    public void setHolderFormStream(PDStream holderFormStream)
    {
        this.holderFormStream = holderFormStream;
    }

    /**
     * Gets Holder form.
     * That form is here <b> AcroForm/DR/XObject/{holder form name} </b>
     * By default, name stars with FRM. We also add number of form
     * to the name.
     * @return the holder form
     */
    public PDFormXObject getHolderForm()
    {
        return holderForm;
    }

    /**
     * In the structure, form will be contained by XObject in the <b>AcroForm/DR/ </b>
     * @param holderForm
     */
    public void setHolderForm(PDFormXObject holderForm)
    {
        this.holderForm = holderForm;
    }

    /**
     * Gets Holder form resources
     * @return the holder form's resources
     */
    public PDResources getHolderFormResources()
    {
        return holderFormResources;
    }

    /**
     * Sets holder form resources
     * @param holderFormResources
     */
    public void setHolderFormResources(PDResources holderFormResources)
    {
        this.holderFormResources = holderFormResources;
    }

    /**
     * Gets AppearanceDictionary
     * That is <b>/AP</b> entry the appearance dictionary.
     * @return the Appearance Dictionary
     */
    public PDAppearanceDictionary getAppearanceDictionary()
    {
        return appearanceDictionary;
    }

    /**
     * Sets AppearanceDictionary
     * That is <b>/AP</b> entry the appearance dictionary.
     * @param appearanceDictionary
     */
    public void setAppearanceDictionary(PDAppearanceDictionary appearanceDictionary)
    {
        this.appearanceDictionary = appearanceDictionary;
    }

    /**
     * Gets Inner form Stream.
     * @return the inner form stream
     */
    public PDStream getInnterFormStream()
    {
        return innterFormStream;
    }

    /**
     * Sets inner form stream
     * @param innterFormStream
     */
    public void setInnterFormStream(PDStream innterFormStream)
    {
        this.innterFormStream = innterFormStream;
    }

    /**
     * Gets inner form Resource
     * @return the inner form's resources
     */
    public PDResources getInnerFormResources()
    {
        return innerFormResources;
    }

    /**
     * Sets inner form resource
     * @param innerFormResources
     */
    public void setInnerFormResources(PDResources innerFormResources)
    {
        this.innerFormResources = innerFormResources;
    }

    /**
     * Gets inner form that is in this location:
     * <b> AcroForm/DR/XObject/{holder form name}/Resources/XObject/{inner name} </b>
     * By default inner form name starts with "n". Then we add number of form
     * to the name.
     * @return the inner form
     */
    public PDFormXObject getInnerForm()
    {
        return innerForm;
    }

    /**
     * sets inner form to this location:
     * <b> AcroForm/DR/XObject/{holder form name}/Resources/XObject/{destination} </b>
     * @param innerForm
     */
    public void setInnerForm(PDFormXObject innerForm)
    {
        this.innerForm = innerForm;
    }

    /**
     * Gets name of inner form
     * @return the inner forms's name
     */
    public COSName getInnerFormName()
    {
        return innerFormName;
    }

    /**
     * Sets inner form name
     * @param innerFormName
     */
    public void setInnerFormName(COSName innerFormName)
    {
        this.innerFormName = innerFormName;
    }

    /**
     * Gets Image form stream
     * @return the image form's stream
     */
    public PDStream getImageFormStream()
    {
        return imageFormStream;
    }

    /**
     * Sets image form stream
     * @param imageFormStream
     */
    public void setImageFormStream(PDStream imageFormStream)
    {
        this.imageFormStream = imageFormStream;
    }

    /**
     * Gets image form resources
     * @return the image form's resources
     */
    public PDResources getImageFormResources()
    {
        return imageFormResources;
    }

    /**
     * Sets image form resource
     * @param imageFormResources
     */
    public void setImageFormResources(PDResources imageFormResources)
    {
        this.imageFormResources = imageFormResources;
    }

    /**
     * Gets Image form. Image form is in this structure: 
     * <b>/AcroForm/DR/{holder form}/Resources/XObject /{inner form} </b>
     * /Resources/XObject/{image form name}.
     * @return the image form
     */
    public PDFormXObject getImageForm()
    {
        return imageForm;
    }

    /**
     * Sets Image form. Image form will be in this structure: 
     * <b>/AcroForm/DR/{holder form}/Resources/XObject /{inner form}
     * /Resources/XObject/{image form name}.</b> By default we start
     *  image form name with "img". Then we  add number of image 
     *  form to the form name.
     * Sets image form
     * @param imageForm
     */
    public void setImageForm(PDFormXObject imageForm)
    {
        this.imageForm = imageForm;
    }

    /**
     * Gets image form name
     * @return the image form's name
     */
    public COSName getImageFormName()
    {
        return imageFormName;
    }

    /**
     * Sets image form name
     * @param imageFormName
     */
    public void setImageFormName(COSName imageFormName)
    {
        this.imageFormName = imageFormName;
    }

    /**
     * Gets visible signature image name
     * @return the visible signature's image name
     */
    public COSName getImageName()
    {
        return imageName;
    }

    /**
     * Sets visible signature image name
     * @param imageName
     */
    public void setImageName(COSName imageName)
    {
        this.imageName = imageName;
    }

    /**
     * Gets COSDocument of visible Signature.
     * @see org.apache.pdfbox.cos.COSDocument
     * @return the visual signature
     */
    public COSDocument getVisualSignature()
    {
        return visualSignature;
    }

    /**
     * 
     * Sets COSDocument of visible Signature.
     * @see org.apache.pdfbox.cos.COSDocument
     * @param visualSignature
     */
    public void setVisualSignature(COSDocument visualSignature)
    {
        this.visualSignature = visualSignature;
    }

    /**
     * Gets acroFormFields
     * @return the AcroForm fields
     */
    public List<PDFieldTreeNode> getAcroFormFields()
    {
        return acroFormFields;
    }

    /**
     * Sets acroFormFields
     * @param acroFormFields
     */
    public void setAcroFormFields(List<PDFieldTreeNode> acroFormFields)
    {
        this.acroFormFields = acroFormFields;
    }
    
   /**
    * Gets AP of the created template
    * @return the templates Appearance Stream
    * @throws IOException
    */
    public ByteArrayInputStream getTemplateAppearanceStream() throws IOException
    {
        COSDocument visualSignature = getVisualSignature();
        ByteArrayOutputStream memoryOut = new ByteArrayOutputStream();
        COSWriter memoryWriter = new COSWriter(memoryOut);
        memoryWriter.write(visualSignature);

        ByteArrayInputStream input = new ByteArrayInputStream(memoryOut.toByteArray());

        getTemplate().close();

        return input;
    }

    /**
     * Gets Widget Dictionary.
     * {@link org.apache.pdfbox.pdmodel.interactive.form.PDField}
     * @see org.apache.pdfbox.pdmodel.interactive.form.PDField#getWidget()
     * @return the widget dictionary
     */
    public COSDictionary getWidgetDictionary()
    {
        return widgetDictionary;
    }

    /**
     * Sets Widget Dictionary.
     * {@link org.apache.pdfbox.pdmodel.interactive.form.PDField}
     * @see org.apache.pdfbox.pdmodel.interactive.form.PDField#getWidget()
     * @param widgetDictionary
     */
    public void setWidgetDictionary(COSDictionary widgetDictionary)
    {
        this.widgetDictionary = widgetDictionary;
    }
}
