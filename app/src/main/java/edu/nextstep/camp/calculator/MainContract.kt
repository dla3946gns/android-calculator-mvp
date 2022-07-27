package edu.nextstep.camp.calculator

import edu.nextstep.camp.calculator.domain.Expression
import edu.nextstep.camp.calculator.domain.Operator

interface MainContract {
    interface View {
        fun showCalculateExpression(expressionStr: String)
        fun showCompletionOfExpressionDataMessage()
    }

    interface Presenter {
        fun inputNumber(number: Int)
        fun inputOperator(operatorData: Operator)
        fun removeLastIndexData()
        fun calculateInputValue()
    }
}