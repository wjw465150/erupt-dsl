package xyz.erupt.upms.looker;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLookerPostLevel is a Querydsl query type for LookerPostLevel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QLookerPostLevel extends EntityPathBase<LookerPostLevel> {

    private static final long serialVersionUID = 1858033804L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLookerPostLevel lookerPostLevel = new QLookerPostLevel("lookerPostLevel");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserPostVo createUser;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUser updateUser;

    public QLookerPostLevel(String variable) {
        this(LookerPostLevel.class, forVariable(variable), INITS);
    }

    public QLookerPostLevel(Path<? extends LookerPostLevel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLookerPostLevel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLookerPostLevel(PathMetadata metadata, PathInits inits) {
        this(LookerPostLevel.class, metadata, inits);
    }

    public QLookerPostLevel(Class<? extends LookerPostLevel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.createUser = inits.isInitialized("createUser") ? new xyz.erupt.upms.model.QEruptUserPostVo(forProperty("createUser"), inits.get("createUser")) : null;
        this.updateUser = inits.isInitialized("updateUser") ? new xyz.erupt.upms.model.QEruptUser(forProperty("updateUser"), inits.get("updateUser")) : null;
    }

}

