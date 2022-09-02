package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptUserPostVo is a Querydsl query type for EruptUserPostVo
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptUserPostVo extends EntityPathBase<EruptUserPostVo> {

    private static final long serialVersionUID = -553524331L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptUserPostVo eruptUserPostVo = new QEruptUserPostVo("eruptUserPostVo");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final QEruptOrg eruptOrg;

    public final QEruptPost eruptPost;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public QEruptUserPostVo(String variable) {
        this(EruptUserPostVo.class, forVariable(variable), INITS);
    }

    public QEruptUserPostVo(Path<? extends EruptUserPostVo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptUserPostVo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptUserPostVo(PathMetadata metadata, PathInits inits) {
        this(EruptUserPostVo.class, metadata, inits);
    }

    public QEruptUserPostVo(Class<? extends EruptUserPostVo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.eruptOrg = inits.isInitialized("eruptOrg") ? new QEruptOrg(forProperty("eruptOrg"), inits.get("eruptOrg")) : null;
        this.eruptPost = inits.isInitialized("eruptPost") ? new QEruptPost(forProperty("eruptPost")) : null;
    }

}

