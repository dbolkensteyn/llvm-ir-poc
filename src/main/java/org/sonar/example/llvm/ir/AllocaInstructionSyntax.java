package org.sonar.example.llvm.ir;

import java.util.Arrays;
import java.util.List;

public class AllocaInstructionSyntax extends InstructionSyntax {

  private final List<SyntaxNode> children;
  private final IdentifierSyntax result;
  private final TypeSyntax type;

  public AllocaInstructionSyntax(
    IdentifierSyntax result, SyntaxToken equalToken, SyntaxToken allocaToken, TypeSyntax type,
    SyntaxToken commaToken, SyntaxToken alignToken, SyntaxToken alignment) {

    this.children = Arrays.asList(
      result, equalToken, allocaToken, type,
      commaToken, alignToken, alignment);

    this.result = result;
    this.type = type;
  }

  @Override
  public List<SyntaxNode> children() {
    return children;
  }

  public IdentifierSyntax result() {
    return result;
  }

  public TypeSyntax type() {
    return type;
  }

}
