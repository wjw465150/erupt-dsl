package xyz.erupt.upms.helper;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHyperModelCreatorVo is a Querydsl query type for HyperModelCreatorVo
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QHyperModelCreatorVo extends EntityPathBase<HyperModelCreatorVo> {

    private static final long serialVersionUID = -619788930L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHyperModelCreatorVo hyperModelCreatorVo = new QHyperModelCreatorVo("hyperModelCreatorVo");

    public final xyz.erupt.upms.model.base.QHyperModel _super;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserVo createUser;

    //inherited
    public final NumberPath<Long> id;

    //inherited
    public final DateTimePath<java.util.Date> updateTime;

    // inherited
    public final xyz.erupt.upms.model.QEruptUserVo updateUser;

    public QHyperModelCreatorVo(String variable) {
        this(HyperModelCreatorVo.class, forVariable(variable), INITS);
    }

    public QHyperModelCreatorVo(Path<? extends HyperModelCreatorVo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHyperModelCreatorVo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHyperModelCreatorVo(PathMetadata metadata, PathInits inits) {
        this(HyperModelCreatorVo.class, metadata, inits);
    }

    public QHyperModelCreatorVo(Class<? extends HyperModelCreatorVo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new xyz.erupt.upms.model.base.QHyperModel(type, metadata, inits);
        this.createUser = inits.isInitialized("createUser") ? new xyz.erupt.upms.model.QEruptUserVo(forProperty("createUser")) : null;
        this.id = _super.id;
        this.updateTime = _super.updateTime;
        this.updateUser = _super.updateUser;
    }

}

