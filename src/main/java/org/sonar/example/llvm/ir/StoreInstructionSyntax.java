package org.sonar.example.llvm.ir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StoreInstructionSyntax extends InstructionSyntax {

  private final List<SyntaxNode> children;
  private final ExpressionSyntax value;
  private final IdentifierSyntax pointer;

  public StoreInstructionSyntax(
    SyntaxToken storeToken,
    TypeSyntax valueType, ExpressionSyntax value,
    SyntaxToken commaToken1, TypeSyntax pointerType, IdentifierSyntax pointer,
    SyntaxToken commaToken2, SyntaxToken alignToken, SyntaxToken alignment) {

    this.children = Collections.unmodifiableList(Arrays.asList(
      storeToken,
      valueType, value,
      commaToken1, pointerType, pointer,
      commaToken2, alignToken, alignment));

    this.value = value;
    this.pointer = pointer;
  }

  @Override
  public List<SyntaxNode> children() {
    return children;
  }

  public ExpressionSyntax value() {
    return value;
  }

  public IdentifierSyntax pointer() {
    return pointer;
  }

}
