/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.vf.ast;

public class VfParserVisitorAdapter implements VfParserVisitor {

    public Object visit(VfNode node, Object data) {
        node.childrenAccept(this, data);
        return data;
    }

    public Object visit(ASTCompilationUnit node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTText node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTElExpression node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTCData node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTElement node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTAttribute node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTAttributeValue node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTCommentTag node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTDeclaration node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTDoctypeDeclaration node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTDoctypeExternalId node, Object data) {
        return visit((VfNode) node, data);
    }

    public Object visit(ASTHtmlScript node, Object data) {
        return visit((VfNode) node, data);
    }

    @Override
    public Object visit(ASTHtmlStyle node, Object data) {
        return visit((VfNode) node, data);
    }

    @Override
    public Object visit(ASTLiteral node, Object data) {
        return visit((VfNode) node, data);
    }

    @Override
    public Object visit(ASTIdentifier node, Object data) {
        return visit((VfNode) node, data);
    }

    @Override
    public Object visit(ASTExpression node, Object data) {
        return visit((VfNode) node, data);
    }
    
    @Override
    public Object visit(ASTArguments node, Object data) {
        return visit((VfNode) node, data);
    }
    
    @Override
    public Object visit(ASTDotExpression node, Object data) {
        return visit((VfNode) node, data);
    }

    @Override
    public Object visit(ASTContent node, Object data) {
        return visit((VfNode) node, data);
    }
}
