package br.edu.infnet.biblioteca.infrastructure.model.data.student;

import br.edu.infnet.biblioteca.domain.model.builder.StudentBuilder;

import java.time.LocalDate;

public class StudentDocument {
    private final String uuid;
    private final String name;
    private final LocalDate age;
    private final String registry;
    private final LocalDate createDate;
    private final LocalDate updateDate;

    public StudentDocument(final StudentBuilder studentBuilder) {
        this.uuid = studentBuilder.getUuid();
        this.name = studentBuilder.getName();
        this.age = studentBuilder.getAge();
        this.registry = studentBuilder.getRegistry();
        this.createDate = studentBuilder.getCreateDate();
        this.updateDate = studentBuilder.getUpdateDate();
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public String getRegistry() {
        return registry;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }
}
