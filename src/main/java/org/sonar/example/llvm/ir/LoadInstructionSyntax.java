package org.sonar.example.llvm.ir;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoadInstructionSyntax extends InstructionSyntax {

  private final List<SyntaxNode> children;
  private final IdentifierSyntax result;
  private final IdentifierSyntax pointer;

  public LoadInstructionSyntax(
    IdentifierSyntax result, SyntaxToken equalToken, SyntaxToken loadToken,
    TypeSyntax pointerType, IdentifierSyntax pointer,
    SyntaxToken commaToken, SyntaxToken alignToken, SyntaxToken alignment) {

    this.children = Collections.unmodifiableList(Arrays.asList(
      result, equalToken, loadToken,
      pointerType, pointer,
      commaToken, alignToken, alignment));

    this.result = result;
    this.pointer = pointer;
  }

  @Override
  public List<SyntaxNode> children() {
    return children;
  }

  public IdentifierSyntax result() {
    return result;
  }

  public IdentifierSyntax pointer() {
    return pointer;
  }

}
