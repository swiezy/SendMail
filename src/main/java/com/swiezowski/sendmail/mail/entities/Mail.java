package com.swiezowski.sendmail.mail.entities;import javax.persistence.*;import java.util.*;@Entitypublic class Mail {    @Id    @GeneratedValue    private Long id;    private UUID uuid;    private String sender;    @ElementCollection    private List<String> recipients;    private MailStatus status;    private String content;    private String subject;    private Mail(){    }    public Mail(UUID uuid, String sender, List<String> recipients, String content, String subject, MailStatus status) {        this.uuid = uuid;        this.sender = sender;        this.recipients = recipients;        this.status = status;        this.content = content;        this.subject = subject;    }    public Long getId() {        return id;    }    public UUID getUuid() {        return uuid;    }    public void setUuid(UUID uuid) {        this.uuid = uuid;    }    public String getSender() {        return sender;    }    public void setSender(String sender) {        this.sender = sender;    }    public List<String> getRecipients() {        return recipients;    }    public MailStatus getStatus() {        return status;    }    public void setStatus(MailStatus status) {        this.status = status;    }    public String getContent() {        return content;    }    public void setContent(String content) {        this.content = content;    }    public String getSubject() {        return subject;    }    public void setSubject(String subject) {        this.subject = subject;    }    @Override    public boolean equals(Object o) {        if (this == o) return true;        if (o == null || getClass() != o.getClass()) return false;        Mail mail = (Mail) o;        return id.equals(mail.id);    }    @Override    public int hashCode() {        return Objects.hash(id);    }}