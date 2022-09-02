package xyz.erupt.jpa.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QBaseTree is a Querydsl query type for BaseTree
 */
@Generated("com.querydsl.codegen.SupertypeSerializer")
public class QBaseTree extends EntityPathBase<BaseTree<?>> {

    private static final long serialVersionUID = -318064578L;

    public static final QBaseTree baseTree = new QBaseTree("baseTree");

    public final QBaseModel _super = new QBaseModel(this);

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath name = createString("name");

    public final SimplePath<Object> parent = createSimple("parent", Object.class);

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseTree(String variable) {
        super((Class) BaseTree.class, forVariable(variable));
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseTree(Path<? extends BaseTree> path) {
        super((Class) path.getType(), path.getMetadata());
    }

    @SuppressWarnings({"all", "rawtypes", "unchecked"})
    public QBaseTree(PathMetadata metadata) {
        super((Class) BaseTree.class, metadata);
    }

}

