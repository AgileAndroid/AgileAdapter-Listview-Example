package com.example.imtoss.agileadapterlistviewexample.core.dto;

/**
 * Created by development on 17/10/15.
 */
public class ItemDTO {

    private String title;
    private String content;

    /**
     * Instantiates a new Item dto.
     *
     * @param title   the title
     * @param content the content
     */
    public ItemDTO(String title, String content) {
        this.title = title;
        this.content = content;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets content.
     *
     * @return the content
     */
    public String getContent() {
        return content;
    }
}
