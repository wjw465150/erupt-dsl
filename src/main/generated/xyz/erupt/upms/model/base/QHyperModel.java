package xyz.erupt.upms.model.base;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHyperModel is a Querydsl query type for HyperModel
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QHyperModel extends EntityPathBase<HyperModel> {

    private static final long serialVersionUID = 904978815L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QHyperModel hyperModel = new QHyperModel("hyperModel");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final DateTimePath<java.util.Date> createTime = createDateTime("createTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserVo createUser;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final DateTimePath<java.util.Date> updateTime = createDateTime("updateTime", java.util.Date.class);

    public final xyz.erupt.upms.model.QEruptUserVo updateUser;

    public QHyperModel(String variable) {
        this(HyperModel.class, forVariable(variable), INITS);
    }

    public QHyperModel(Path<? extends HyperModel> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QHyperModel(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QHyperModel(PathMetadata metadata, PathInits inits) {
        this(HyperModel.class, metadata, inits);
    }

    public QHyperModel(Class<? extends HyperModel> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.createUser = inits.isInitialized("createUser") ? new xyz.erupt.upms.model.QEruptUserVo(forProperty("createUser")) : null;
        this.updateUser = inits.isInitialized("updateUser") ? new xyz.erupt.upms.model.QEruptUserVo(forProperty("updateUser")) : null;
    }

}

