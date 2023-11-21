async function getAllQuestions () {
    const response = await fetch("http://localhost:8080/question/allQuestions");
    const questions = await response.json();
    return questions;
}

const allQuestions = getAllQuestions();
//console.log(allQuestions);


