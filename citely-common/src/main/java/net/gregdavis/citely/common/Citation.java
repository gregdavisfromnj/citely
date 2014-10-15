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


    /**
     * Gets the "entryKey" element
     */
    @Id
    int getId() {
        return id;
    }


    /**
     * Sets the "entryKey" element
     */
    void setId(int id) {
        this.id = id;
    }

    /**
     * String
     * Gets the "address" element
     */
    String getAddress() {
        return address;
    }


    /**
     * Sets the "address" element
     */
    void setAddress(String address) {
        this.address = address;
    }


    /**
     * Gets the "annote" element
     */
    String getAnnote() {
        return annote;
    }


    /**
     * Sets the "annote" element
     */
    void setAnnote(String annote) {
        this.annote = annote;
    }


    /**
     * Gets the "author" element
     */
    String getAuthor() {
        return Author;
    }


    /**
     * Sets the "author" element
     */
    void setAuthor(String author) {
        this.author = author;
    }


    /**
     * Gets the "booktitle" element
     */
    String getBooktitle() {
        return Booktitle;
    }


    /**
     * Sets the "booktitle" element
     */
    void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
    }


    /**
     * Gets the "chapter" element
     */
    String getChapter() {
        return Chapter;
    }


    /**
     * Sets the "chapter" element
     */
    void setChapter(String chapter) {
        this.chapter = chapter;
    }


    /**
     * Gets the "crossref" element
     */
    String getCrossref() {
        return Crossref;
    }


    /**
     * Sets the "crossref" element
     */
    void setCrossref(String crossref) {
        this.crossref = crossref;
    }


    /**
     * Gets the "edition" element
     */
    String getEdition() {
        return Edition;
    }


    /**
     * Sets the "edition" element
     */
    void setEdition(String edition) {
        this.edition = edition;
    }


    /**
     * Gets the "editor" element
     */
    String getEditor() {
        return Editor;
    }


    /**
     * Sets the "editor" element
     */
    void setEditor(String editor) {
        this.editor = editor;
    }


    /**
     * Gets the "eprint" element
     */
    String getEprint() {
        return Eprint;
    }


    /**
     * Sets the "eprint" element
     */
    void setEprint(String eprint) {
        this.eprint = eprint;
    }


    /**
     * Gets the "howpublished" element
     */
    String getHowpublished() {
        return Howpublished;
    }


    /**
     * Sets the "howpublished" element
     */
    void setHowpublished(String howpublished) {
        this.howpublished = howpublished;
    }


    /**
     * Gets the "institution" element
     */
    String getInstitution() {
        return Institution;
    }


    /**
     * Sets the "institution" element
     */
    void setInstitution(String institution) {
        this.institution = institution;
    }


    /**
     * Gets the "journal" element
     */
    String getJournal() {
        return Journal;
    }


    /**
     * Sets the "journal" element
     */
    void setJournal(String journal) {
        this.journal = journal;
    }


    /**
     * Gets the "key" element
     */
    String getKey() {
        return Key;
    }


    /**
     * Sets the "key" element
     */
    void setKey(String key) {
        this.key = key;
    }


    /**
     * Gets the "month" element
     */
    String getMonth() {
        return Month;
    }


    /**
     * Sets the "month" element
     */
    void setMonth(String month) {
        this.month = month;
    }


    /**
     * Gets the "note" element
     */
    String getNote() {
        return Note;
    }


    /**
     * Sets the "note" element
     */
    void setNote(String note) {
        this.note = note;
    }


    /**
     * Gets the "number" element
     */
    String getNumber() {
        return Number;
    }

    /**
     * Sets the "number" element
     */
    void setNumber(String number) {
        this.number = number;
    }


    /**
     * Gets the "organization" element
     */
    String getOrganization() {
        return Organization;
    }


    /**
     * Sets the "organization" element
     */
    void setOrganization(String organization) {
        this.organization = organization;
    }


    /**
     * Gets the "pages" element
     */
    String getPages() {
        return Pages;
    }


    /**
     * Sets the "pages" element
     */
    void setPages(String pages) {
        this.pages = pages;
    }


    /**
     * Gets the "publisher" element
     */
    String getPublisher() {
        return Publisher;
    }


    /**
     * Sets the "publisher" element
     */
    void setPublisher(String publisher) {
        this.publisher = publisher;
    }


    /**
     * Gets the "school" element
     */
    String getSchool() {
        return School;
    }


    /**
     * Sets the "school" element
     */
    void setSchool(String school) {
        this.school = school;
    }


    /**
     * Gets the "series" element
     */
    String getSeries() {
        return Series;
    }


    /**
     * Sets the "series" element
     */
    void setSeries(String series) {
        this.series = series;
    }


    /**
     * Gets the "title" element
     */
    String getTitle() {
        return Title;
    }


    /**
     * Sets the "title" element
     */
    void setTitle(String title) {
        this.title = title;
    }


    /**
     * Gets the "type" element
     */
    String getType() {
        return Type;
    }


    /**
     * Sets the "type" element
     */
    void setType(String type) {
        this.type = type;
    }


    /**
     * Gets the "url" element
     */
    String getUrl() {
        return Url;
    }


    /**
     * Sets the "url" element
     */
    void setUrl(String url) {
        this.url = url;
    }


    /**
     * Gets the "volume" element
     */
    String getVolume() {
        return Volume;
    }


    /**
     * Sets the "volume" element
     */
    void setVolume(String volume) {
        this.volume = volume;
    }


    /**
     * Gets the "year" element
     */
    String getYear() {
        return Year;
    }


    /**
     * Sets the "year" element
     */
    void setYear(String year) {
        this.year = year;
    }


    /**
     * Gets the "publicationType" element
     */
    PublicationType getPublicationType() {
        return PublicationType;
    }


    /**
     * Sets the "publicationType" element
     */
    void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }


}
