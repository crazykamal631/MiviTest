package web.com.mivitestapp.server.pojo;

public class ResponseIncluded {
    private ResponseIncludedRelationships relationships;
    private ResponseIncludedAttributes attributes;
    private ResponseIncludedLinks links;
    private String id;
    private String type;

    public ResponseIncludedRelationships getRelationships() {
        return this.relationships;
    }

    public void setRelationships(ResponseIncludedRelationships relationships) {
        this.relationships = relationships;
    }

    public ResponseIncludedAttributes getAttributes() {
        return this.attributes;
    }

    public void setAttributes(ResponseIncludedAttributes attributes) {
        this.attributes = attributes;
    }

    public ResponseIncludedLinks getLinks() {
        return this.links;
    }

    public void setLinks(ResponseIncludedLinks links) {
        this.links = links;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
