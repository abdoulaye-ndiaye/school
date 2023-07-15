package com.uadb.school.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Blog.class)
public abstract class Blog_ {

	public static volatile SingularAttribute<Blog, String> name;
	public static volatile SingularAttribute<Blog, String> handle;
	public static volatile SingularAttribute<Blog, Long> id;
	public static volatile SingularAttribute<Blog, User> user;

	public static final String NAME = "name";
	public static final String HANDLE = "handle";
	public static final String ID = "id";
	public static final String USER = "user";

}

