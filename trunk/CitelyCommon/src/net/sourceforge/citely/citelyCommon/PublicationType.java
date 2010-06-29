/*
 * XML Type:  PublicationType
 * Namespace: http://citely.sourceforge.net/CitelyCommon
 * Java type: net.sourceforge.citely.citelyCommon.PublicationType
 *
 * Automatically generated - do not modify.
 */
package net.sourceforge.citely.citelyCommon;


/**
 * An XML PublicationType(@http://citely.sourceforge.net/CitelyCommon).
 *
 * This is an atomic type that is a restriction of net.sourceforge.citely.citelyCommon.PublicationType.
 */
public interface PublicationType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicationType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s783BC3F8AF8D1B61A5C5B6BCFA099470").resolveHandle("publicationtypedc7etype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ARTICLE = Enum.forString("article");
    static final Enum BOOK = Enum.forString("book");
    static final Enum BOOKLET = Enum.forString("booklet");
    static final Enum CONFERENCE = Enum.forString("conference");
    static final Enum INBOOK = Enum.forString("inbook");
    static final Enum INCOLLECTION = Enum.forString("incollection");
    static final Enum INPROCEEDINGS = Enum.forString("inproceedings");
    static final Enum MANUAL = Enum.forString("manual");
    static final Enum MASTERSTHESIS = Enum.forString("mastersthesis");
    static final Enum MISC = Enum.forString("misc");
    static final Enum PHDTHESIS = Enum.forString("phdthesis");
    static final Enum PROCEEDINGS = Enum.forString("proceedings");
    static final Enum TECHREPORT = Enum.forString("techreport");
    static final Enum UNPUBLISHED = Enum.forString("unpublished");
    
    static final int INT_ARTICLE = Enum.INT_ARTICLE;
    static final int INT_BOOK = Enum.INT_BOOK;
    static final int INT_BOOKLET = Enum.INT_BOOKLET;
    static final int INT_CONFERENCE = Enum.INT_CONFERENCE;
    static final int INT_INBOOK = Enum.INT_INBOOK;
    static final int INT_INCOLLECTION = Enum.INT_INCOLLECTION;
    static final int INT_INPROCEEDINGS = Enum.INT_INPROCEEDINGS;
    static final int INT_MANUAL = Enum.INT_MANUAL;
    static final int INT_MASTERSTHESIS = Enum.INT_MASTERSTHESIS;
    static final int INT_MISC = Enum.INT_MISC;
    static final int INT_PHDTHESIS = Enum.INT_PHDTHESIS;
    static final int INT_PROCEEDINGS = Enum.INT_PROCEEDINGS;
    static final int INT_TECHREPORT = Enum.INT_TECHREPORT;
    static final int INT_UNPUBLISHED = Enum.INT_UNPUBLISHED;
    
    /**
     * Enumeration value class for net.sourceforge.citely.citelyCommon.PublicationType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ARTICLE
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_ARTICLE = 1;
        static final int INT_BOOK = 2;
        static final int INT_BOOKLET = 3;
        static final int INT_CONFERENCE = 4;
        static final int INT_INBOOK = 5;
        static final int INT_INCOLLECTION = 6;
        static final int INT_INPROCEEDINGS = 7;
        static final int INT_MANUAL = 8;
        static final int INT_MASTERSTHESIS = 9;
        static final int INT_MISC = 10;
        static final int INT_PHDTHESIS = 11;
        static final int INT_PROCEEDINGS = 12;
        static final int INT_TECHREPORT = 13;
        static final int INT_UNPUBLISHED = 14;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("article", INT_ARTICLE),
                new Enum("book", INT_BOOK),
                new Enum("booklet", INT_BOOKLET),
                new Enum("conference", INT_CONFERENCE),
                new Enum("inbook", INT_INBOOK),
                new Enum("incollection", INT_INCOLLECTION),
                new Enum("inproceedings", INT_INPROCEEDINGS),
                new Enum("manual", INT_MANUAL),
                new Enum("mastersthesis", INT_MASTERSTHESIS),
                new Enum("misc", INT_MISC),
                new Enum("phdthesis", INT_PHDTHESIS),
                new Enum("proceedings", INT_PROCEEDINGS),
                new Enum("techreport", INT_TECHREPORT),
                new Enum("unpublished", INT_UNPUBLISHED),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static net.sourceforge.citely.citelyCommon.PublicationType newValue(java.lang.Object obj) {
          return (net.sourceforge.citely.citelyCommon.PublicationType) type.newValue( obj ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType newInstance() {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static net.sourceforge.citely.citelyCommon.PublicationType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (net.sourceforge.citely.citelyCommon.PublicationType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
