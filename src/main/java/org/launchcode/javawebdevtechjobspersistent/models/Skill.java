package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {

    @ManyToMany (mappedBy = "skills")
    private List<Job> jobs;

    @NotBlank(message = "Skill description is required")
    @Size(max = 600, message = "Skill description cannot exceed 600 characters")
    private String description;

    public Skill(String description) {
        this.description = description;
    }

    public Skill() {}

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}