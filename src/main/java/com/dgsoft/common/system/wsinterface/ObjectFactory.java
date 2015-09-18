
package com.dgsoft.common.system.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dgsoft.system.wsinterface package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetAllDictionary_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getAllDictionary");
    private final static QName _GetDictionaryWordValue_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getDictionaryWordValue");
    private final static QName _GetAllDictionaryResponse_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getAllDictionaryResponse");
    private final static QName _GetDictionaryWords_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getDictionaryWords");
    private final static QName _GetDictionaryWord_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getDictionaryWord");
    private final static QName _GetDictionaryWordValueResponse_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getDictionaryWordValueResponse");
    private final static QName _GetDictionaryWordResponse_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getDictionaryWordResponse");
    private final static QName _GetDictionaryWordsResponse_QNAME = new QName("http://ws.system.common.dgsoft.com/", "getDictionaryWordsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dgsoft.system.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetDictionaryWordValue }
     * 
     */
    public GetDictionaryWordValue createGetDictionaryWordValue() {
        return new GetDictionaryWordValue();
    }

    /**
     * Create an instance of {@link GetAllDictionaryResponse }
     * 
     */
    public GetAllDictionaryResponse createGetAllDictionaryResponse() {
        return new GetAllDictionaryResponse();
    }

    /**
     * Create an instance of {@link GetDictionaryWord }
     * 
     */
    public GetDictionaryWord createGetDictionaryWord() {
        return new GetDictionaryWord();
    }

    /**
     * Create an instance of {@link GetDictionaryWords }
     * 
     */
    public GetDictionaryWords createGetDictionaryWords() {
        return new GetDictionaryWords();
    }

    /**
     * Create an instance of {@link GetDictionaryWordResponse }
     * 
     */
    public GetDictionaryWordResponse createGetDictionaryWordResponse() {
        return new GetDictionaryWordResponse();
    }

    /**
     * Create an instance of {@link GetDictionaryWordValueResponse }
     * 
     */
    public GetDictionaryWordValueResponse createGetDictionaryWordValueResponse() {
        return new GetDictionaryWordValueResponse();
    }

    /**
     * Create an instance of {@link GetDictionaryWordsResponse }
     * 
     */
    public GetDictionaryWordsResponse createGetDictionaryWordsResponse() {
        return new GetDictionaryWordsResponse();
    }

    /**
     * Create an instance of {@link GetAllDictionary }
     * 
     */
    public GetAllDictionary createGetAllDictionary() {
        return new GetAllDictionary();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDictionary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getAllDictionary")
    public JAXBElement<GetAllDictionary> createGetAllDictionary(GetAllDictionary value) {
        return new JAXBElement<GetAllDictionary>(_GetAllDictionary_QNAME, GetAllDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryWordValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getDictionaryWordValue")
    public JAXBElement<GetDictionaryWordValue> createGetDictionaryWordValue(GetDictionaryWordValue value) {
        return new JAXBElement<GetDictionaryWordValue>(_GetDictionaryWordValue_QNAME, GetDictionaryWordValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDictionaryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getAllDictionaryResponse")
    public JAXBElement<GetAllDictionaryResponse> createGetAllDictionaryResponse(GetAllDictionaryResponse value) {
        return new JAXBElement<GetAllDictionaryResponse>(_GetAllDictionaryResponse_QNAME, GetAllDictionaryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryWords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getDictionaryWords")
    public JAXBElement<GetDictionaryWords> createGetDictionaryWords(GetDictionaryWords value) {
        return new JAXBElement<GetDictionaryWords>(_GetDictionaryWords_QNAME, GetDictionaryWords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryWord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getDictionaryWord")
    public JAXBElement<GetDictionaryWord> createGetDictionaryWord(GetDictionaryWord value) {
        return new JAXBElement<GetDictionaryWord>(_GetDictionaryWord_QNAME, GetDictionaryWord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryWordValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getDictionaryWordValueResponse")
    public JAXBElement<GetDictionaryWordValueResponse> createGetDictionaryWordValueResponse(GetDictionaryWordValueResponse value) {
        return new JAXBElement<GetDictionaryWordValueResponse>(_GetDictionaryWordValueResponse_QNAME, GetDictionaryWordValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryWordResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getDictionaryWordResponse")
    public JAXBElement<GetDictionaryWordResponse> createGetDictionaryWordResponse(GetDictionaryWordResponse value) {
        return new JAXBElement<GetDictionaryWordResponse>(_GetDictionaryWordResponse_QNAME, GetDictionaryWordResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDictionaryWordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.system.common.dgsoft.com/", name = "getDictionaryWordsResponse")
    public JAXBElement<GetDictionaryWordsResponse> createGetDictionaryWordsResponse(GetDictionaryWordsResponse value) {
        return new JAXBElement<GetDictionaryWordsResponse>(_GetDictionaryWordsResponse_QNAME, GetDictionaryWordsResponse.class, null, value);
    }

}
