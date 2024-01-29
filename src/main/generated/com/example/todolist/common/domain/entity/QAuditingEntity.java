package com.example.todolist.common.domain.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QAuditingEntity is a Querydsl query type for AuditingEntity
 */
@Generated("com.querydsl.codegen.DefaultSupertypeSerializer")
public class QAuditingEntity extends EntityPathBase<AuditingEntity> {

    private static final long serialVersionUID = -400646347L;

    public static final QAuditingEntity auditingEntity = new QAuditingEntity("auditingEntity");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final DateTimePath<java.time.LocalDateTime> modifiedDate = createDateTime("modifiedDate", java.time.LocalDateTime.class);

    public final StringPath name = createString("name");

    public QAuditingEntity(String variable) {
        super(AuditingEntity.class, forVariable(variable));
    }

    public QAuditingEntity(Path<? extends AuditingEntity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAuditingEntity(PathMetadata metadata) {
        super(AuditingEntity.class, metadata);
    }

}

