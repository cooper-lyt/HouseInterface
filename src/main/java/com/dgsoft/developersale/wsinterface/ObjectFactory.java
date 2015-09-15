
package com.dgsoft.developersale.wsinterface;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dgsoft.developersale.wsinterface package. 
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

    private final static QName _GetBuildGridMap_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "getBuildGridMap");
    private final static QName _SubmitContractResponse_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "submitContractResponse");
    private final static QName _SearchPledgeInfoResponse_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "searchPledgeInfoResponse");
    private final static QName _SubmitContract_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "submitContract");
    private final static QName _Logon_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "logon");
    private final static QName _GetBuildGridMapResponse_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "getBuildGridMapResponse");
    private final static QName _LogonResponse_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "logonResponse");
    private final static QName _SearchPledgeInfo_QNAME = new QName("http://ws.owner.house.dgsoft.com/", "searchPledgeInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dgsoft.developersale.wsinterface
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBuildGridMapResponse }
     * 
     */
    public GetBuildGridMapResponse createGetBuildGridMapResponse() {
        return new GetBuildGridMapResponse();
    }

    /**
     * Create an instance of {@link GetBuildGridMap }
     * 
     */
    public GetBuildGridMap createGetBuildGridMap() {
        return new GetBuildGridMap();
    }

    /**
     * Create an instance of {@link SubmitContract }
     * 
     */
    public SubmitContract createSubmitContract() {
        return new SubmitContract();
    }

    /**
     * Create an instance of {@link SearchPledgeInfo }
     * 
     */
    public SearchPledgeInfo createSearchPledgeInfo() {
        return new SearchPledgeInfo();
    }

    /**
     * Create an instance of {@link SearchPledgeInfoResponse }
     * 
     */
    public SearchPledgeInfoResponse createSearchPledgeInfoResponse() {
        return new SearchPledgeInfoResponse();
    }

    /**
     * Create an instance of {@link LogonResponse }
     * 
     */
    public LogonResponse createLogonResponse() {
        return new LogonResponse();
    }

    /**
     * Create an instance of {@link SubmitContractResponse }
     * 
     */
    public SubmitContractResponse createSubmitContractResponse() {
        return new SubmitContractResponse();
    }

    /**
     * Create an instance of {@link Logon }
     * 
     */
    public Logon createLogon() {
        return new Logon();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuildGridMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "getBuildGridMap")
    public JAXBElement<GetBuildGridMap> createGetBuildGridMap(GetBuildGridMap value) {
        return new JAXBElement<GetBuildGridMap>(_GetBuildGridMap_QNAME, GetBuildGridMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "submitContractResponse")
    public JAXBElement<SubmitContractResponse> createSubmitContractResponse(SubmitContractResponse value) {
        return new JAXBElement<SubmitContractResponse>(_SubmitContractResponse_QNAME, SubmitContractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPledgeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "searchPledgeInfoResponse")
    public JAXBElement<SearchPledgeInfoResponse> createSearchPledgeInfoResponse(SearchPledgeInfoResponse value) {
        return new JAXBElement<SearchPledgeInfoResponse>(_SearchPledgeInfoResponse_QNAME, SearchPledgeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitContract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "submitContract")
    public JAXBElement<SubmitContract> createSubmitContract(SubmitContract value) {
        return new JAXBElement<SubmitContract>(_SubmitContract_QNAME, SubmitContract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logon }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "logon")
    public JAXBElement<Logon> createLogon(Logon value) {
        return new JAXBElement<Logon>(_Logon_QNAME, Logon.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBuildGridMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "getBuildGridMapResponse")
    public JAXBElement<GetBuildGridMapResponse> createGetBuildGridMapResponse(GetBuildGridMapResponse value) {
        return new JAXBElement<GetBuildGridMapResponse>(_GetBuildGridMapResponse_QNAME, GetBuildGridMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "logonResponse")
    public JAXBElement<LogonResponse> createLogonResponse(LogonResponse value) {
        return new JAXBElement<LogonResponse>(_LogonResponse_QNAME, LogonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchPledgeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.owner.house.dgsoft.com/", name = "searchPledgeInfo")
    public JAXBElement<SearchPledgeInfo> createSearchPledgeInfo(SearchPledgeInfo value) {
        return new JAXBElement<SearchPledgeInfo>(_SearchPledgeInfo_QNAME, SearchPledgeInfo.class, null, value);
    }

}
