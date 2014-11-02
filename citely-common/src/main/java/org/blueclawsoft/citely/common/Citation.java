/**
 *  Copyright 2014 Gregory J. Davis
 *
 *  This file is part of Citely.
 *  Citely is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Citely is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Citely.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.blueclawsoft.citely.common;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This schema, including some parts and documentation,
 * is derived from the Wikipedia description of BiBTeX records at
 * http://en.wikipedia.org/wiki/BibTeX. It's not authoritative.
 * Wikipedia just had the information I need in a form that can be
 * schema-fied quickly. So thanks, Wikipedia.
 */
@Entity
public class Citation {
    private Integer id;
    private Integer ownerId;
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
    private Integer publicationType;

    /**
     * Gets the "entryKey" element
     */
    @Id
    public Integer getId() {
        return id;
    }

    /**
     * Sets the "entryKey" element
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets the "entryKey" element
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * Sets the "entryKey" element
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * Gets the "address" element
     * <p/>
     * Publisher's address (usually just the city, but
     * can be the full address for lesser-known
     * publishers).
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
     * <p/>
     * An annotation for annotated bibliography styles
     * (not typical).
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
     * <p/>
     * The name(s) of the author(s) (in the case of
     * more than one author, separated by and)
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
     * <p/>
     * The title of the book, if only part of it is
     * being cited.
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
     * <p/>
     * The chapter number.
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
     * <p/>
     * The key of the cross-referenced entry
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
     * <p/>
     * The edition of a book, long form (such as
     * "first" or "second")
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
     * <p/>
     * The name(s) of the editor(s)
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
     * <p/>
     * A specification of an electronic publication,
     * often a preprint or a technical report
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
     * <p/>
     * How it was published, if the publishing method
     * is nonstandard
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
     * <p/>
     * The institution that was involved in the
     * publishing, but not necessarily the publisher
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
     * <p/>
     * The journal or magazine the work was published
     * in
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
     * <p/>
     * A hidden field used for specifying or overriding
     * the alphabetical order of entries (when the
     * "author" and "editor" fields are missing). Note
     * that this is very different from the key
     * (mentioned just after this list) that is used to
     * cite or cross-reference the entry.
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
     * <p/>
     * The month of publication (or, if unpublished,
     * the month of creation)
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
     * <p/>
     * Miscellaneous extra information
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
     * <p/>
     * The "number" of a journal, magazine, or
     * tech-report, if applicable. (Most publications
     * have a "volume", but no "number" field.)
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
     * <p/>
     * The conference sponsor
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
     * <p/>
     * Page numbers, separated either by commas or
     * double-hyphens.
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
     * <p/>
     * The publisher's name
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
     * <p/>
     * The school where the thesis was written
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
     * <p/>
     * The series of books the book was published in
     * (e.g. "The Hardy Boys" or "Lecture Notes in
     * Computer Science")
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
     * <p/>
     * The title of the work
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
     * <p/>
     * The type of tech-report, for example, "Research
     * Note"
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
     * <p/>
     * The WWW address
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
     * <p/>
     * The volume of a journal or multi-volume book
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
     * <p/>
     * The year of publication (or, if unpublished, the
     * year of creation)
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
     * <p/>
     * What kind of publication this is
     */
    public Integer getPublicationType() {
        return publicationType;
    }

    /**
     * Sets the "publicationType" element
     */
    public void setPublicationType(Integer publicationType) {
        this.publicationType = publicationType;
    }
}
