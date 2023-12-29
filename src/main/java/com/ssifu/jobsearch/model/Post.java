package com.ssifu.jobsearch.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "posts")
public class Post {

    @Id
    private String _id;
    private String desc;
    private String exp;
    private String profile;
    private List<String> techs;

    public Post(String _id, String desc, String exp, String profile, List<String> techs) {
        this._id = _id;
        this.desc = desc;
        this.exp = exp;
        this.profile = profile;
        this.techs = techs;
    }

    public Post() {
    }

    public String get_id() {
        return _id;
    }

    public String getDesc() {
        return desc;
    }

    public String getExp() {
        return exp;
    }

    public String getProfile() {
        return profile;
    }

    public List<String> getTechs() {
        return techs;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public void setTechs(List<String> techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "_id=" + _id +
                ", desc='" + desc + '\'' +
                ", exp='" + exp + '\'' +
                ", profile='" + profile + '\'' +
                ", techs=" + techs +
                '}';
    }
}
