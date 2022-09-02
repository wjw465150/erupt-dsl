package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBiGroup is a Querydsl query type for BiGroup
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBiGroup extends EntityPathBase<BiGroup> {

    private static final long serialVersionUID = -1473790109L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBiGroup biGroup = new QBiGroup("biGroup");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    public final StringPath code = createString("code");

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final QBiGroup parent;

    public final StringPath remark = createString("remark");

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBiGroup(String variable) {
        this(BiGroup.class, forVariable(variable), INITS);
    }

    public QBiGroup(Path<? extends BiGroup> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBiGroup(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBiGroup(PathMetadata metadata, PathInits inits) {
        this(BiGroup.class, metadata, inits);
    }

    public QBiGroup(Class<? extends BiGroup> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QBiGroup(forProperty("parent"), inits.get("parent")) : null;
    }

}

