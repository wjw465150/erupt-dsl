package xyz.erupt.upms.looker;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QLookerOrg is a Querydsl query type for LookerOrg
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QLookerOrg extends EntityPathBase<LookerOrg> {

    private static final long serialVersionUID = 646940332L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLookerOrg lookerOrg = new QLookerOrg("lookerOrg");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserPostVo createUser;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserPostVo updateUser;

    public QLookerOrg(String variable) {
        this(LookerOrg.class, forVariable(variable), INITS);
    }

    public QLookerOrg(Path<? extends LookerOrg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QLookerOrg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QLookerOrg(PathMetadata metadata, PathInits inits) {
        this(LookerOrg.class, metadata, inits);
    }

    public QLookerOrg(Class<? extends LookerOrg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.createUser = inits.isInitialized("createUser") ? new xyz.erupt.upms.model.QEruptUserPostVo(forProperty("createUser"), inits.get("createUser")) : null;
        this.updateUser = inits.isInitialized("updateUser") ? new xyz.erupt.upms.model.QEruptUserPostVo(forProperty("updateUser"), inits.get("updateUser")) : null;
    }

}

