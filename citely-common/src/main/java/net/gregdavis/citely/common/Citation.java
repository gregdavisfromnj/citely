package net.gregdavis.citely.common;


/**
 * A Citation entity.
 */

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Citation {

    private int id;
    private String address;
    private String annote;
    private String author;
    private String booktitle;
    private String chapter;
    private String crossref;
    private String edition;
    private String editor;
    private String eprint;
    private String howpublished;
    private String institution;
    private String journal;
    private String key;
    private String month;
    private String note;
    private String number;
    private String organization;
    private String pages;
    private String publisher;
    private String school;
    private String series;
    private String title;
    private String type;
    private String url;
    private String volume;
    private String year;
    private PublicationType publicationType;

    /**
     * Gets the "entryKey" element
     */
    @Id
    public int getId() {
        return id;
    }


    /**
     * Sets the "entryKey" element
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * String
     * Gets the "address" element
     */
    public String getAddress() {
        return address;
    }


    /**
     * Sets the "address" element
     */
    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the "annote" element
     */
    public String getAnnote() {
        return annote;
    }


    /**
     * Sets the "annote" element
     */
    public void setAnnote(String annote) {
        this.annote = annote;
    }


    /**
     * Gets the "author" element
     */
    public String getAuthor() {
        return author;
    }


    /**
     * Sets the "author" element
     */
    public void setAuthor(String author) {
        this.author = author;
    }


    /**
     * Gets the "booktitle" element
     */
    public String getBooktitle() {
        return booktitle;
    }


    /**
     * Sets the "booktitle" element
     */
    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }


    /**
     * Gets the "chapter" element
     */
    public String getChapter() {
        return chapter;
    }


    /**
     * Sets the "chapter" element
     */
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }


    /**
     * Gets the "crossref" element
     */
    public String getCrossref() {
        return crossref;
    }


    /**
     * Sets the "crossref" element
     */
    public void setCrossref(String crossref) {
        this.crossref = crossref;
    }


    /**
     * Gets the "edition" element
     */
    public String getEdition() {
        return edition;
    }


    /**
     * Sets the "edition" element
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }


    /**
     * Gets the "editor" element
     */
    public String getEditor() {
        return editor;
    }


    /**
     * Sets the "editor" element
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }


    /**
     * Gets the "eprint" element
     */
    public String getEprint() {
        return eprint;
    }


    /**
     * Sets the "eprint" element
     */
    public void setEprint(String eprint) {
        this.eprint = eprint;
    }


    /**
     * Gets the "howpublished" element
     */
    public String getHowpublished() {
        return howpublished;
    }


    /**
     * Sets the "howpublished" element
     */
    public void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
    }


    /**
     * Gets the "institution" element
     */
    public String getInstitution() {
        return institution;
    }


    /**
     * Sets the "institution" element
     */
    public void setInstitution(String institution) {
        this.institution = institution;
    }


    /**
     * Gets the "journal" element
     */
    public String getJournal() {
        return journal;
    }


    /**
     * Sets the "journal" element
     */
    public void setJournal(String journal) {
        this.journal = journal;
    }


    /**
     * Gets the "key" element
     */
    public String getKey() {
        return key;
    }


    /**
     * Sets the "key" element
     */
    public void setKey(String key) {
        this.key = key;
    }


    /**
     * Gets the "month" element
     */
    public String getMonth() {
        return month;
    }


    /**
     * Sets the "month" element
     */
    public void setMonth(String month) {
        this.month = month;
    }


    /**
     * Gets the "note" element
     */
    public String getNote() {
        return note;
    }


    /**
     * Sets the "note" element
     */
    public void setNote(String note) {
        this.note = note;
    }


    /**
     * Gets the "number" element
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the "number" element
     */
    public void setNumber(String number) {
        this.number = number;
    }


    /**
     * Gets the "organization" element
     */
    public String getOrganization() {
        return organization;
    }


    /**
     * Sets the "organization" element
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }


    /**
     * Gets the "pages" element
     */
    public String getPages() {
        return pages;
    }


    /**
     * Sets the "pages" element
     */
    public void setPages(String pages) {
        this.pages = pages;
    }


    /**
     * Gets the "publisher" element
     */
    public String getPublisher() {
        return publisher;
    }


    /**
     * Sets the "publisher" element
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the "school" element
     */
    public String getSchool() {
        return school;
    }


    /**
     * Sets the "school" element
     */
    public void setSchool(String school) {
        this.school = school;
    }


    /**
     * Gets the "series" element
     */
    public String getSeries() {
        return series;
    }


    /**
     * Sets the "series" element
     */
    public void setSeries(String series) {
        this.series = series;
    }


    /**
     * Gets the "title" element
     */
    public String getTitle() {
        return title;
    }


    /**
     * Sets the "title" element
     */
    public void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the "type" element
     */
    public String getType() {
        return type;
    }


    /**
     * Sets the "type" element
     */
    public void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the "url" element
     */
    public String getUrl() {
        return url;
    }


    /**
     * Sets the "url" element
     */
    public void setUrl(String url) {
        this.url = url;
    }


    /**
     * Gets the "volume" element
     */
    public String getVolume() {
        return volume;
    }


    /**
     * Sets the "volume" element
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }


    /**
     * Gets the "year" element
     */
    public String getYear() {
        return year;
    }


    /**
     * Sets the "year" element
     */
    public void setYear(String year) {
        this.year = year;
    }


    /**
     * Gets the "publicationType" element
     */
    public PublicationType getPublicationType() {
        return publicationType;
    }


    /**
     * Sets the "publicationType" element
     */
    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

}
