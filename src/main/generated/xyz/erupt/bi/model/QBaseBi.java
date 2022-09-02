package xyz.erupt.bi.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseBi is a Querydsl query type for BaseBi
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QBaseBi extends EntityPathBase<BaseBi> {

    private static final long serialVersionUID = 1054745773L;

    public static final QBaseBi baseBi = new QBaseBi("baseBi");

    public final xyz.erupt.jpa.model.QMetaModelUpdateVo _super = new xyz.erupt.jpa.model.QMetaModelUpdateVo(this);

    //inherited
    public final StringPath createBy = _super.createBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createTime = _super.createTime;

    //inherited
    public final NumberPath<Long> id = _super.id;

    //inherited
    public final StringPath updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updateTime = _super.updateTime;

    public QBaseBi(String variable) {
        super(BaseBi.class, forVariable(variable));
    }

    public QBaseBi(Path<? extends BaseBi> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseBi(PathMetadata metadata) {
        super(BaseBi.class, metadata);
    }

}

