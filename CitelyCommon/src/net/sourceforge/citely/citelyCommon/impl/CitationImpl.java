/*
 * XML Type:  Citation
 * Namespace: http://citely.sourceforge.net/CitelyCommon
 * Java type: net.sourceforge.citely.citelyCommon.Citation
 *
 * Automatically generated - do not modify.
 */
package net.sourceforge.citely.citelyCommon.impl;
/**
 * An XML Citation(@http://citely.sourceforge.net/CitelyCommon).
 *
 * This is a complex type.
 */
public class CitationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.sourceforge.citely.citelyCommon.Citation
{
    
    public CitationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "address");
    private static final javax.xml.namespace.QName ANNOTE$2 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "annote");
    private static final javax.xml.namespace.QName AUTHOR$4 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "author");
    private static final javax.xml.namespace.QName BOOKTITLE$6 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "booktitle");
    private static final javax.xml.namespace.QName CHAPTER$8 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "chapter");
    private static final javax.xml.namespace.QName CROSSREF$10 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "crossref");
    private static final javax.xml.namespace.QName EDITION$12 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "edition");
    private static final javax.xml.namespace.QName EDITOR$14 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "editor");
    private static final javax.xml.namespace.QName EPRINT$16 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "eprint");
    private static final javax.xml.namespace.QName HOWPUBLISHED$18 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "howpublished");
    private static final javax.xml.namespace.QName INSTITUTION$20 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "institution");
    private static final javax.xml.namespace.QName JOURNAL$22 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "journal");
    private static final javax.xml.namespace.QName KEY$24 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "key");
    private static final javax.xml.namespace.QName MONTH$26 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "month");
    private static final javax.xml.namespace.QName NOTE$28 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "note");
    private static final javax.xml.namespace.QName NUMBER$30 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "number");
    private static final javax.xml.namespace.QName ORGANIZATION$32 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "organization");
    private static final javax.xml.namespace.QName PAGES$34 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "pages");
    private static final javax.xml.namespace.QName PUBLISHER$36 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "publisher");
    private static final javax.xml.namespace.QName SCHOOL$38 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "school");
    private static final javax.xml.namespace.QName SERIES$40 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "series");
    private static final javax.xml.namespace.QName TITLE$42 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "title");
    private static final javax.xml.namespace.QName TYPE$44 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "type");
    private static final javax.xml.namespace.QName URL$46 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "url");
    private static final javax.xml.namespace.QName VOLUME$48 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "volume");
    private static final javax.xml.namespace.QName YEAR$50 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "year");
    private static final javax.xml.namespace.QName PUBLICATIONTYPE$52 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "publicationType");
    private static final javax.xml.namespace.QName ENTRYKEY$54 = 
        new javax.xml.namespace.QName("http://citely.sourceforge.net/CitelyCommon", "entryKey");
    
    
    /**
     * Gets the "address" element
     */
    public java.lang.String getAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "address" element
     */
    public org.apache.xmlbeans.XmlString xgetAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "address" element
     */
    public void setAddress(java.lang.String address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDRESS$0);
            }
            target.setStringValue(address);
        }
    }
    
    /**
     * Sets (as xml) the "address" element
     */
    public void xsetAddress(org.apache.xmlbeans.XmlString address)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDRESS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDRESS$0);
            }
            target.set(address);
        }
    }
    
    /**
     * Gets the "annote" element
     */
    public java.lang.String getAnnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "annote" element
     */
    public org.apache.xmlbeans.XmlString xgetAnnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNOTE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "annote" element
     */
    public void setAnnote(java.lang.String annote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANNOTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANNOTE$2);
            }
            target.setStringValue(annote);
        }
    }
    
    /**
     * Sets (as xml) the "annote" element
     */
    public void xsetAnnote(org.apache.xmlbeans.XmlString annote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANNOTE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANNOTE$2);
            }
            target.set(annote);
        }
    }
    
    /**
     * Gets the "author" element
     */
    public java.lang.String getAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "author" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "author" element
     */
    public void setAuthor(java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHOR$4);
            }
            target.setStringValue(author);
        }
    }
    
    /**
     * Sets (as xml) the "author" element
     */
    public void xsetAuthor(org.apache.xmlbeans.XmlString author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHOR$4);
            }
            target.set(author);
        }
    }
    
    /**
     * Gets the "booktitle" element
     */
    public java.lang.String getBooktitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKTITLE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "booktitle" element
     */
    public org.apache.xmlbeans.XmlString xgetBooktitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKTITLE$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "booktitle" element
     */
    public void setBooktitle(java.lang.String booktitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOKTITLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOKTITLE$6);
            }
            target.setStringValue(booktitle);
        }
    }
    
    /**
     * Sets (as xml) the "booktitle" element
     */
    public void xsetBooktitle(org.apache.xmlbeans.XmlString booktitle)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BOOKTITLE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BOOKTITLE$6);
            }
            target.set(booktitle);
        }
    }
    
    /**
     * Gets the "chapter" element
     */
    public java.lang.String getChapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHAPTER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "chapter" element
     */
    public org.apache.xmlbeans.XmlString xgetChapter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHAPTER$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "chapter" element
     */
    public void setChapter(java.lang.String chapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHAPTER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHAPTER$8);
            }
            target.setStringValue(chapter);
        }
    }
    
    /**
     * Sets (as xml) the "chapter" element
     */
    public void xsetChapter(org.apache.xmlbeans.XmlString chapter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CHAPTER$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CHAPTER$8);
            }
            target.set(chapter);
        }
    }
    
    /**
     * Gets the "crossref" element
     */
    public java.lang.String getCrossref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CROSSREF$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "crossref" element
     */
    public org.apache.xmlbeans.XmlString xgetCrossref()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CROSSREF$10, 0);
            return target;
        }
    }
    
    /**
     * Sets the "crossref" element
     */
    public void setCrossref(java.lang.String crossref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CROSSREF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CROSSREF$10);
            }
            target.setStringValue(crossref);
        }
    }
    
    /**
     * Sets (as xml) the "crossref" element
     */
    public void xsetCrossref(org.apache.xmlbeans.XmlString crossref)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CROSSREF$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CROSSREF$10);
            }
            target.set(crossref);
        }
    }
    
    /**
     * Gets the "edition" element
     */
    public java.lang.String getEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "edition" element
     */
    public org.apache.xmlbeans.XmlString xgetEdition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITION$12, 0);
            return target;
        }
    }
    
    /**
     * Sets the "edition" element
     */
    public void setEdition(java.lang.String edition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDITION$12);
            }
            target.setStringValue(edition);
        }
    }
    
    /**
     * Sets (as xml) the "edition" element
     */
    public void xsetEdition(org.apache.xmlbeans.XmlString edition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITION$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDITION$12);
            }
            target.set(edition);
        }
    }
    
    /**
     * Gets the "editor" element
     */
    public java.lang.String getEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITOR$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "editor" element
     */
    public org.apache.xmlbeans.XmlString xgetEditor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITOR$14, 0);
            return target;
        }
    }
    
    /**
     * Sets the "editor" element
     */
    public void setEditor(java.lang.String editor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EDITOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EDITOR$14);
            }
            target.setStringValue(editor);
        }
    }
    
    /**
     * Sets (as xml) the "editor" element
     */
    public void xsetEditor(org.apache.xmlbeans.XmlString editor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EDITOR$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EDITOR$14);
            }
            target.set(editor);
        }
    }
    
    /**
     * Gets the "eprint" element
     */
    public java.lang.String getEprint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EPRINT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "eprint" element
     */
    public org.apache.xmlbeans.XmlString xgetEprint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EPRINT$16, 0);
            return target;
        }
    }
    
    /**
     * Sets the "eprint" element
     */
    public void setEprint(java.lang.String eprint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EPRINT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EPRINT$16);
            }
            target.setStringValue(eprint);
        }
    }
    
    /**
     * Sets (as xml) the "eprint" element
     */
    public void xsetEprint(org.apache.xmlbeans.XmlString eprint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EPRINT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EPRINT$16);
            }
            target.set(eprint);
        }
    }
    
    /**
     * Gets the "howpublished" element
     */
    public java.lang.String getHowpublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOWPUBLISHED$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "howpublished" element
     */
    public org.apache.xmlbeans.XmlString xgetHowpublished()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOWPUBLISHED$18, 0);
            return target;
        }
    }
    
    /**
     * Sets the "howpublished" element
     */
    public void setHowpublished(java.lang.String howpublished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HOWPUBLISHED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HOWPUBLISHED$18);
            }
            target.setStringValue(howpublished);
        }
    }
    
    /**
     * Sets (as xml) the "howpublished" element
     */
    public void xsetHowpublished(org.apache.xmlbeans.XmlString howpublished)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HOWPUBLISHED$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HOWPUBLISHED$18);
            }
            target.set(howpublished);
        }
    }
    
    /**
     * Gets the "institution" element
     */
    public java.lang.String getInstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTITUTION$20, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "institution" element
     */
    public org.apache.xmlbeans.XmlString xgetInstitution()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTITUTION$20, 0);
            return target;
        }
    }
    
    /**
     * Sets the "institution" element
     */
    public void setInstitution(java.lang.String institution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INSTITUTION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INSTITUTION$20);
            }
            target.setStringValue(institution);
        }
    }
    
    /**
     * Sets (as xml) the "institution" element
     */
    public void xsetInstitution(org.apache.xmlbeans.XmlString institution)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INSTITUTION$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INSTITUTION$20);
            }
            target.set(institution);
        }
    }
    
    /**
     * Gets the "journal" element
     */
    public java.lang.String getJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNAL$22, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "journal" element
     */
    public org.apache.xmlbeans.XmlString xgetJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOURNAL$22, 0);
            return target;
        }
    }
    
    /**
     * Sets the "journal" element
     */
    public void setJournal(java.lang.String journal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNAL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOURNAL$22);
            }
            target.setStringValue(journal);
        }
    }
    
    /**
     * Sets (as xml) the "journal" element
     */
    public void xsetJournal(org.apache.xmlbeans.XmlString journal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOURNAL$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOURNAL$22);
            }
            target.set(journal);
        }
    }
    
    /**
     * Gets the "key" element
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$24, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key" element
     */
    public org.apache.xmlbeans.XmlString xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$24, 0);
            return target;
        }
    }
    
    /**
     * Sets the "key" element
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(KEY$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(KEY$24);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "key" element
     */
    public void xsetKey(org.apache.xmlbeans.XmlString key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(KEY$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(KEY$24);
            }
            target.set(key);
        }
    }
    
    /**
     * Gets the "month" element
     */
    public java.lang.String getMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTH$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "month" element
     */
    public org.apache.xmlbeans.XmlString xgetMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MONTH$26, 0);
            return target;
        }
    }
    
    /**
     * Sets the "month" element
     */
    public void setMonth(java.lang.String month)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTH$26);
            }
            target.setStringValue(month);
        }
    }
    
    /**
     * Sets (as xml) the "month" element
     */
    public void xsetMonth(org.apache.xmlbeans.XmlString month)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MONTH$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MONTH$26);
            }
            target.set(month);
        }
    }
    
    /**
     * Gets the "note" element
     */
    public java.lang.String getNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "note" element
     */
    public org.apache.xmlbeans.XmlString xgetNote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$28, 0);
            return target;
        }
    }
    
    /**
     * Sets the "note" element
     */
    public void setNote(java.lang.String note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOTE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOTE$28);
            }
            target.setStringValue(note);
        }
    }
    
    /**
     * Sets (as xml) the "note" element
     */
    public void xsetNote(org.apache.xmlbeans.XmlString note)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOTE$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOTE$28);
            }
            target.set(note);
        }
    }
    
    /**
     * Gets the "number" element
     */
    public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "number" element
     */
    public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$30, 0);
            return target;
        }
    }
    
    /**
     * Sets the "number" element
     */
    public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$30);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "number" element
     */
    public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$30);
            }
            target.set(number);
        }
    }
    
    /**
     * Gets the "organization" element
     */
    public java.lang.String getOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "organization" element
     */
    public org.apache.xmlbeans.XmlString xgetOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$32, 0);
            return target;
        }
    }
    
    /**
     * Sets the "organization" element
     */
    public void setOrganization(java.lang.String organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORGANIZATION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORGANIZATION$32);
            }
            target.setStringValue(organization);
        }
    }
    
    /**
     * Sets (as xml) the "organization" element
     */
    public void xsetOrganization(org.apache.xmlbeans.XmlString organization)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ORGANIZATION$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ORGANIZATION$32);
            }
            target.set(organization);
        }
    }
    
    /**
     * Gets the "pages" element
     */
    public java.lang.String getPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$34, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pages" element
     */
    public org.apache.xmlbeans.XmlString xgetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$34, 0);
            return target;
        }
    }
    
    /**
     * Sets the "pages" element
     */
    public void setPages(java.lang.String pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGES$34);
            }
            target.setStringValue(pages);
        }
    }
    
    /**
     * Sets (as xml) the "pages" element
     */
    public void xsetPages(org.apache.xmlbeans.XmlString pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGES$34);
            }
            target.set(pages);
        }
    }
    
    /**
     * Gets the "publisher" element
     */
    public java.lang.String getPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHER$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "publisher" element
     */
    public org.apache.xmlbeans.XmlString xgetPublisher()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHER$36, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publisher" element
     */
    public void setPublisher(java.lang.String publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLISHER$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLISHER$36);
            }
            target.setStringValue(publisher);
        }
    }
    
    /**
     * Sets (as xml) the "publisher" element
     */
    public void xsetPublisher(org.apache.xmlbeans.XmlString publisher)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PUBLISHER$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PUBLISHER$36);
            }
            target.set(publisher);
        }
    }
    
    /**
     * Gets the "school" element
     */
    public java.lang.String getSchool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHOOL$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "school" element
     */
    public org.apache.xmlbeans.XmlString xgetSchool()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHOOL$38, 0);
            return target;
        }
    }
    
    /**
     * Sets the "school" element
     */
    public void setSchool(java.lang.String school)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHOOL$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHOOL$38);
            }
            target.setStringValue(school);
        }
    }
    
    /**
     * Sets (as xml) the "school" element
     */
    public void xsetSchool(org.apache.xmlbeans.XmlString school)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCHOOL$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCHOOL$38);
            }
            target.set(school);
        }
    }
    
    /**
     * Gets the "series" element
     */
    public java.lang.String getSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIES$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "series" element
     */
    public org.apache.xmlbeans.XmlString xgetSeries()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIES$40, 0);
            return target;
        }
    }
    
    /**
     * Sets the "series" element
     */
    public void setSeries(java.lang.String series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SERIES$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SERIES$40);
            }
            target.setStringValue(series);
        }
    }
    
    /**
     * Sets (as xml) the "series" element
     */
    public void xsetSeries(org.apache.xmlbeans.XmlString series)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SERIES$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SERIES$40);
            }
            target.set(series);
        }
    }
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$42, 0);
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$42);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$42);
            }
            target.set(title);
        }
    }
    
    /**
     * Gets the "type" element
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$44, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$44, 0);
            return target;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$44);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TYPE$44, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TYPE$44);
            }
            target.set(type);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$46, 0);
            return target;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$46);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$46);
            }
            target.set(url);
        }
    }
    
    /**
     * Gets the "volume" element
     */
    public java.lang.String getVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$48, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "volume" element
     */
    public org.apache.xmlbeans.XmlString xgetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$48, 0);
            return target;
        }
    }
    
    /**
     * Sets the "volume" element
     */
    public void setVolume(java.lang.String volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUME$48);
            }
            target.setStringValue(volume);
        }
    }
    
    /**
     * Sets (as xml) the "volume" element
     */
    public void xsetVolume(org.apache.xmlbeans.XmlString volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$48, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUME$48);
            }
            target.set(volume);
        }
    }
    
    /**
     * Gets the "year" element
     */
    public java.lang.String getYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$50, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "year" element
     */
    public org.apache.xmlbeans.XmlString xgetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEAR$50, 0);
            return target;
        }
    }
    
    /**
     * Sets the "year" element
     */
    public void setYear(java.lang.String year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEAR$50);
            }
            target.setStringValue(year);
        }
    }
    
    /**
     * Sets (as xml) the "year" element
     */
    public void xsetYear(org.apache.xmlbeans.XmlString year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEAR$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YEAR$50);
            }
            target.set(year);
        }
    }
    
    /**
     * Gets the "publicationType" element
     */
    public net.sourceforge.citely.citelyCommon.PublicationType.Enum getPublicationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONTYPE$52, 0);
            if (target == null)
            {
                return null;
            }
            return (net.sourceforge.citely.citelyCommon.PublicationType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "publicationType" element
     */
    public net.sourceforge.citely.citelyCommon.PublicationType xgetPublicationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.sourceforge.citely.citelyCommon.PublicationType target = null;
            target = (net.sourceforge.citely.citelyCommon.PublicationType)get_store().find_element_user(PUBLICATIONTYPE$52, 0);
            return target;
        }
    }
    
    /**
     * Sets the "publicationType" element
     */
    public void setPublicationType(net.sourceforge.citely.citelyCommon.PublicationType.Enum publicationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PUBLICATIONTYPE$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PUBLICATIONTYPE$52);
            }
            target.setEnumValue(publicationType);
        }
    }
    
    /**
     * Sets (as xml) the "publicationType" element
     */
    public void xsetPublicationType(net.sourceforge.citely.citelyCommon.PublicationType publicationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.sourceforge.citely.citelyCommon.PublicationType target = null;
            target = (net.sourceforge.citely.citelyCommon.PublicationType)get_store().find_element_user(PUBLICATIONTYPE$52, 0);
            if (target == null)
            {
                target = (net.sourceforge.citely.citelyCommon.PublicationType)get_store().add_element_user(PUBLICATIONTYPE$52);
            }
            target.set(publicationType);
        }
    }
    
    /**
     * Gets the "entryKey" element
     */
    public java.lang.String getEntryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTRYKEY$54, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "entryKey" element
     */
    public org.apache.xmlbeans.XmlString xgetEntryKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRYKEY$54, 0);
            return target;
        }
    }
    
    /**
     * Sets the "entryKey" element
     */
    public void setEntryKey(java.lang.String entryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTRYKEY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTRYKEY$54);
            }
            target.setStringValue(entryKey);
        }
    }
    
    /**
     * Sets (as xml) the "entryKey" element
     */
    public void xsetEntryKey(org.apache.xmlbeans.XmlString entryKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENTRYKEY$54, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENTRYKEY$54);
            }
            target.set(entryKey);
        }
    }
}
