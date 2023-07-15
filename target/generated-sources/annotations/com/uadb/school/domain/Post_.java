package com.uadb.school.domain;

import java.time.Instant;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Post.class)
public abstract class Post_ {

	public static volatile SingularAttribute<Post, Instant> date;
	public static volatile SingularAttribute<Post, Long> id;
	public static volatile SingularAttribute<Post, String> title;
	public static volatile SingularAttribute<Post, Blog> blog;
	public static volatile SingularAttribute<Post, String> content;
	public static volatile SetAttribute<Post, Tag> tags;

	public static final String DATE = "date";
	public static final String ID = "id";
	public static final String TITLE = "title";
	public static final String BLOG = "blog";
	public static final String CONTENT = "content";
	public static final String TAGS = "tags";

}

