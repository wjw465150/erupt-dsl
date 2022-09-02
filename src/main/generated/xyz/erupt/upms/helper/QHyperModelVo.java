package xyz.erupt.upms.helper;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHyperModelVo is a Querydsl query type for HyperModelVo
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QHyperModelVo extends EntityPathBase<HyperModelVo> {

    private static final long serialVersionUID = -308363424L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHyperModelVo hyperModelVo = new QHyperModelVo("hyperModelVo");

    public final xyz.erupt.upms.model.base.QHyperModel _super;

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserVo createUser;

    //inherited
    public final NumberPath<Long> id;

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserVo updateUser;

    public QHyperModelVo(String variable) {
        this(HyperModelVo.class, forVariable(variable), INITS);
    }

    public QHyperModelVo(Path<? extends HyperModelVo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHyperModelVo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHyperModelVo(PathMetadata metadata, PathInits inits) {
        this(HyperModelVo.class, metadata, inits);
    }

    public QHyperModelVo(Class<? extends HyperModelVo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new xyz.erupt.upms.model.base.QHyperModel(type, metadata, inits);
        this.createUser = inits.isInitialized("createUser") ? new xyz.erupt.upms.model.QEruptUserVo(forProperty("createUser")) : null;
        this.id = _super.id;
        this.updateUser = inits.isInitialized("updateUser") ? new xyz.erupt.upms.model.QEruptUserVo(forProperty("updateUser")) : null;
    }

}

