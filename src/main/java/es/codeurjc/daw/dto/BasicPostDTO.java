
package es.codeurjc.daw.dto;

/**
 * @author fran
 */
public class BasicPostDTO {

    private Long id;

    private String title;

    public BasicPostDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
