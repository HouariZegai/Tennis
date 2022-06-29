import { Button, ButtonGroup, Card, CardContent, Container, Grid, Typography } from '@mui/material'
import React, { useEffect, useState } from 'react'
import { fetchScore } from '../api/Tennis'

const GameBoard = () => {
  const [score, setScore] = useState({})

  const getScore = async () => {
    const res = await fetchScore()
    console.table('res: ', res)
    setScore(res)
  }

  useEffect(() => {
    getScore()
  }, [])

  return (
    <Container maxWidth="sm">
        <Grid container spacing={2} marginTop={1}>
          <Grid item xs={12}>
              <Typography>Game Board</Typography>
          </Grid>
          
          <Grid item xs={6}>
            <Typography fontSize={16}>Record New Score</Typography>
          </Grid>
          <Grid item xs={6}>
            <ButtonGroup variant="contained" aria-label="contained button group">
              <Button>Player 1</Button>
              <Button>Player 2</Button>
            </ButtonGroup>
          </Grid>

          <Grid item xs={12}>
            <Typography>Result</Typography>
          </Grid>
          <Grid item xs={6}>
            <Card sx={{ minWidth: 275 }}>
                <CardContent>
                    <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
                        Player Name
                    </Typography>
                    <Typography variant="h5" component="div">
                        {score?.firstPlayer?.name}
                    </Typography>
                    <Typography sx={{ mt: 1.5 }} color="text.secondary">Score</Typography>
                    <Typography variant="body2" sx={{ fontSize: 14 }}>{score?.firstPlayer?.score}</Typography>
                </CardContent>
            </Card>
          </Grid>
          <Grid item xs={6}>
            <Card sx={{ minWidth: 275 }}>
                <CardContent>
                    <Typography sx={{ fontSize: 14 }} color="text.secondary" gutterBottom>
                        Player Name
                    </Typography>
                    <Typography variant="h5" component="div">
                        {score?.secondPlayer?.name}
                    </Typography>
                    <Typography sx={{ mt: 1.5 }} color="text.secondary">Score</Typography>
                    <Typography variant="body2" sx={{ fontSize: 14 }}>{score?.secondPlayer?.score}</Typography>
                </CardContent>
            </Card>
          </Grid>
          <Grid item xs={12}>
            <Card>
              <CardContent>
                  <Typography sx={{ fontSize: 12 }} color="text.secondary" gutterBottom>
                      Score
                  </Typography>
                  <Typography variant="h5" component="div">{score?.score}</Typography>
              </CardContent>
            </Card>
          </Grid>
        </Grid>
    </Container>
  )
}

export default GameBoard