/**
 * Created by Maxon on 28.07.2018.
 */
import axios from 'axios'

export default {

  async getQuestions () {
    const response = await axios.get('api/questions', {
      timeout: 5000
    })
    return response.data._embedded.questions.map(q => {
      delete q._links
      return q
    })
  },


  async updateQuestion (questionId, question) {
    return axios.put(`api/questions/${questionId}`, question, {
      timeout: 5000
    })
  }
}