package xyz.erupt.upms.helper;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHyperModelUpdateVo is a Querydsl query type for HyperModelUpdateVo
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QHyperModelUpdateVo extends EntityPathBase<HyperModelUpdateVo> {

    private static final long serialVersionUID = -656372535L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHyperModelUpdateVo hyperModelUpdateVo = new QHyperModelUpdateVo("hyperModelUpdateVo");

    public final xyz.erupt.upms.model.base.QHyperModel _super;

    //inherited
    public final DateTimePath<java.util.Date> createTime;

    // inherited
    public final xyz.erupt.upms.model.QEruptUserVo createUser;

    //inherited
    public final NumberPath<Long> id;

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserVo updateUser;

    public QHyperModelUpdateVo(String variable) {
        this(HyperModelUpdateVo.class, forVariable(variable), INITS);
    }

    public QHyperModelUpdateVo(Path<? extends HyperModelUpdateVo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHyperModelUpdateVo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHyperModelUpdateVo(PathMetadata metadata, PathInits inits) {
        this(HyperModelUpdateVo.class, metadata, inits);
    }

    public QHyperModelUpdateVo(Class<? extends HyperModelUpdateVo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new xyz.erupt.upms.model.base.QHyperModel(type, metadata, inits);
        this.createTime = _super.createTime;
        this.createUser = _super.createUser;
        this.id = _super.id;
        this.updateUser = inits.isInitialized("updateUser") ? new xyz.erupt.upms.model.QEruptUserVo(forProperty("updateUser")) : null;
    }

}

