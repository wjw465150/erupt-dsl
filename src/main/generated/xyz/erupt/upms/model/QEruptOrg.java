package xyz.erupt.upms.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QEruptOrg is a Querydsl query type for EruptOrg
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEruptOrg extends EntityPathBase<EruptOrg> {

    private static final long serialVersionUID = -2086926445L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QEruptOrg eruptOrg = new QEruptOrg("eruptOrg");

    public final xyz.erupt.jpa.model.QBaseModel _super = new xyz.erupt.jpa.model.QBaseModel(this);

    public final StringPath code = createString("code");

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final QEruptOrg parentOrg;

    public final NumberPath<Integer> sort = createNumber("sort", Integer.class);

    public QEruptOrg(String variable) {
        this(EruptOrg.class, forVariable(variable), INITS);
    }

    public QEruptOrg(Path<? extends EruptOrg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QEruptOrg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QEruptOrg(PathMetadata metadata, PathInits inits) {
        this(EruptOrg.class, metadata, inits);
    }

    public QEruptOrg(Class<? extends EruptOrg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parentOrg = inits.isInitialized("parentOrg") ? new QEruptOrg(forProperty("parentOrg"), inits.get("parentOrg")) : null;
    }

}

